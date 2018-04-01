package it.andrea.balasso.web.application.common.conf;

import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.util.StringUtils;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ImportResource(locations = "classpath:persistence-context.xml")
public class DatabaseConfiguration {

    private Logger logger = LoggerFactory.getLogger(DatabaseConfiguration.class);

    public static final String PERSISTENCE_UNIT = "springProjectPu";

    @Autowired
    private Environment environment;

    @Autowired
    private ResourcePatternResolver resourcePatternResolver;

    @Bean
    @Primary
    public DataSource dataSource() throws Exception {
        String jndiUrl = environment.getProperty("wap.datasource.jndi");
        DataSource dataSource = null;
        if (!StringUtils.isEmpty(jndiUrl)) {
            logger.info("Using jndi {}", jndiUrl);
            final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
            dsLookup.setResourceRef(true);
            try {
                dataSource = dsLookup.getDataSource(jndiUrl);
            } catch (Exception e) {
                logger.warn("Failed to load the datasource {}", jndiUrl);
            }
        }

        if (dataSource == null) {
            HikariDataSource hikariDataSource = new HikariDataSource();

            hikariDataSource.setDriverClassName(environment.getProperty("wap.datasource.driverClassName"));
            hikariDataSource.setJdbcUrl(environment.getProperty("wap.datasource.jdbcUrl"));
            hikariDataSource.setUsername(environment.getProperty("wap.datasource.username"));
            hikariDataSource.setPassword(environment.getProperty("wap.datasource.password"));
            hikariDataSource.setMinimumIdle(environment.getProperty("wap.datasource.minPoolSize", Integer.class, 5));
            hikariDataSource.setMaximumPoolSize(environment.getProperty("wap.datasource.maxPoolSize", Integer.class, 10));

            dataSource = hikariDataSource;

        }

        return dataSource;
    }

    @Bean
    @Primary
    @Qualifier("springProjectEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean springProjectEntityManagerFactory(
            EntityManagerFactoryBuilder builder) throws Exception {
        LocalContainerEntityManagerFactoryBean entityManager = builder
                .dataSource(dataSource())
                .packages(environment.getProperty("wap.entity.package"))
                .persistenceUnit(PERSISTENCE_UNIT)
                .build();

        Properties props = new Properties();
        props.setProperty("hibernate.hbm2ddl.auto", "none");
        props.setProperty("hibernate.show_sql", environment.getProperty("wap.hibernate.showsql"));
        props.setProperty("hibernate.format_sql", environment.getProperty("wap.hibernate.formatsql"));

        entityManager.setJpaProperties(props);
        return entityManager;
    }

}

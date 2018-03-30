package it.andrea.balasso.web.application.common.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by andrea on 23/10/16.
 */
@Configuration
@Import(CustomerImportSelector.class)
public class IntegrationConfig {
}

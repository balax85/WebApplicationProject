package it.andrea.balasso.web.application.core;

import org.springframework.boot.Banner;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class WebApplicationBoot extends SpringBootServletInitializer {

    public static final String  APPLICATION_NAME = "wap";

    private static Map<String, Object> props = new HashMap<>();

    static {
        String appScanRootDirectory = "classpath:" + APPLICATION_NAME + ".properties";
        String appConfigurationDirectory = "classpath:conf/";
        String appConfAppName = "classpath:" + APPLICATION_NAME + "/";
        String[] scanDirectories = new String[] {
                appScanRootDirectory,
                appConfigurationDirectory,
                appConfAppName
        };
        props.put("spring,config.name", APPLICATION_NAME);
        props.put("spring.config.location", StringUtils.arrayToDelimitedString(scanDirectories, ","));
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder
                .sources(WebApplicationBoot.class)
                .bannerMode(Banner.Mode.OFF)
                .properties(props);
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(WebApplicationBoot.class)
                .bannerMode(Banner.Mode.OFF)
                .properties(props)
                .run(args);
    }

}

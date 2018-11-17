package com.barstad.projectc44.Configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfiguration extends ResourceConfig {

    public JerseyConfiguration() {
        packages("com.barstad.projectc44");
    }

}

package com.springangular.config.root;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springangular.service.ServicePackage;

@Configuration
@ComponentScan(basePackageClasses = {ServicePackage.class, MongoConfig.class})
public class RootContextConfig {

}

package com.tiket.bncc.tdd.demo.configuration;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.Collections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {

  private static final String version = "0.0.1";

  @Bean
  public Docket docket() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.tiket.bncc.tdd.demo.controller"))
        .paths(regex("/.*"))
        .build()
        .apiInfo(apiInfo());

  }

  private ApiInfo apiInfo() {
    return new ApiInfo(
        "Fun TDD Spring Boot API",
        "API Documentation with swagger 2",
        version,
        null, null, null, null, Collections.emptyList());
  }

}

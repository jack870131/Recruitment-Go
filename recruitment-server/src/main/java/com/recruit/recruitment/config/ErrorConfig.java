package com.recruit.recruitment.config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class ErrorConfig implements ErrorPageRegistrar {
  @Override
  public void registerErrorPages(ErrorPageRegistry registry) {
    registry.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/not-found"));
  }
}

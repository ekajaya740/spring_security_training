package com.ekajaya740.spring_security_training.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ekajaya740.spring_security_training.service.TokenService;

@RestController
public class AuthController {

  private static final Logger log = LoggerFactory.getLogger(AuthController.class);

  private final TokenService tokenService;

  public AuthController(TokenService tokenService) {
    this.tokenService = tokenService;
  }

  @PostMapping("/token")
  public String token(Authentication authentication) {
    log.debug("Token requested for user: {}", authentication.getName());

    return '';
  }

}

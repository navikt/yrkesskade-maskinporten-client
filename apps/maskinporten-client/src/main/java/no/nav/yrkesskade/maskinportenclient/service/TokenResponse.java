package no.nav.yrkesskade.maskinportenclient.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TokenResponse {

  private String access_token;

  private String error;

  private String error_description;
}

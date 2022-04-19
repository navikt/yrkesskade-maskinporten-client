package no.nav.yrkesskade.maskinportenclient.validation;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ScopeValidation {

  private boolean isValid;
  private String unsupportedScopes;
  private String requestedScopes;
}

package no.yrkesskade.maskinportenclient.validation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import no.nav.yrkesskade.maskinportenclient.config.MaskinportenConfig;
import no.nav.yrkesskade.maskinportenclient.validation.ScopeValidator;
import org.junit.jupiter.api.Test;

public class ScopeValidatorTest {

  @Test
  public void TestIsValid() {
    MaskinportenConfig maskinportenConfig = new MaskinportenConfig();
    maskinportenConfig.setScope("nav:yrkesskade:skademelding.write");
    ScopeValidator scopeValidator = new ScopeValidator(maskinportenConfig);
    assertTrue(scopeValidator.validate("nav:yrkesskade:skademelding.write").isValid());

    assertFalse(scopeValidator.validate("nav:yrkesskade:skademelding.read").isValid());
  }
}

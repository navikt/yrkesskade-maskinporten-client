package no.nav.yrkesskade.maskinportenclient.config;

import com.nimbusds.jose.jwk.RSAKey;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("maskinporten")
public class MaskinportenConfig {

  private String tokenUrl;
  private String audience;
  private String issuer;
  private String scope;
  private String privateKey;
}

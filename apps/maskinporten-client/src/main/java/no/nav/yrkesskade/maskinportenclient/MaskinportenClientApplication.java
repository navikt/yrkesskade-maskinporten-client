package no.nav.yrkesskade.maskinportenclient;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Yrkesskade Maskinporten Client", version = "0.2", description = "Tilbyr Maskinporten-tokens for Team Yrkesskade"))
public class MaskinportenClientApplication {
  public static void main(String[] args) {
    SpringApplication.run(MaskinportenClientApplication.class, args);
  }
}

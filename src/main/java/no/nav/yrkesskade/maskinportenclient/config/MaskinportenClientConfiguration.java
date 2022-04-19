package no.nav.yrkesskade.maskinportenclient.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({MaskinportenConfig.class})
public class MaskinportenClientConfiguration { }

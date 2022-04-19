package no.nav.yrkesskade.maskinportenclient.service;

import com.nimbusds.jose.JOSEException;
import java.io.IOException;
import java.text.ParseException;

public interface MaskinportenTokenClient {

  TokenResponse getToken(String scopes) throws JOSEException, IOException, InterruptedException, ParseException;
}

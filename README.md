# Yrkesskade Maskinporten Client

En Spring Boot-applikasjon gir Team Yrkesskade mulighet til å utstede gyldige tokens for test av endepunkter som krever Maskinporten-tokens. Applikasjonen kjører i intern sone på GCP og skal kun brukes i forbindelse med test. Kan ikke kalles på av andre tjenester. Koble til `naisdevice` og bruk `/token` eller swagger-ui på `/` for å generere token.

Applikasjonen ligger tilgjengelig på:
* [https://yrkesskade-maskinporten-client.dev.intern.nav.no/](https://yrkesskade-maskinporten-client.dev.intern.nav.no/) (dev-gcp)
* [https://yrkesskade-maskinporten-client.intern.nav.no/](https://yrkesskade-maskinporten-client.intern.nav.no/) (prod-gcp)

Token utstedt i `dev-gcp` bruker `https://ver2.maskinporten.no/`. Tokenet kan derfor kun brukes av tjenester som også bruker `https://ver2.maskinporten.no/` for validering (typisk tjenester i dev).

## Generere token

For å generere et token må man oppgi parameteren `scopes` som en kommaseparert liste. 

Eksempelvis:

```/token?scopes=nav:yrkesskade:scope1.read,nav:yrkesskade:scope2.read```

Ofte vil man kun være ute etter token for ett scope og da blir det slik:

```/token?scopes=nav:yrkesskade:scope1.read```

Dersom scopet du ber om ikke er definert i lista over støttede scopes vil du få `400-BadRequest`.

> MERK: Dersom et scope ikke har blitt registrert av tjenesten som krever det, vil en klient konfigurert med det samme scopet heller ikke registreres korrekt. Altså må tjenesten, som krever Maskinporten token med det bestemte scopet, deployes før klienten som ønsker å utstede tokens med samme scope. Gjøres dette i "feil" rekkefølge må klienten redeployes for å få det til å fungere.

## Legge til flere støttede scopes

Applikasjonen kan enkelt utvides til å støtte flere scopes ved behov. For å legge til flere scopes må de legges til i `nais.yaml` under `maskinporten.scopes.consumes`:

```
maskinporten:
  enabled: true
  scopes:
    consumes:
      - name: "nav:yrkesskade:scope1.read"
      - name: "nav:yrkesskade:scope2.read"
      - name: ... flere scopes her
```

Disse scopene vil da dukke opp i environment-variabelen `MASKINPORTEN_SCOPES` og tjenesten vil kunne begynne å generere tokens med disse.

---

# Henvendelser 

Spørsmål knyttet til koden eller prosjektet kan:
- stilles som issues her på GitHub
- stilles til yrkesskade@nav.no

## For NAV-ansatte

Interne henvendelser kan sendes via Slack i kanalen #team-yrkesskade.

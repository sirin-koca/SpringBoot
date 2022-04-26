# SpringBoot 🚀 
***

## GitHub URL: [SpringBoot](https://github.com/sirin-koca/SpringBoot)

## URL til Heroku app: [Sirin-HerokuApp](https://data1700-oblig2-sirin.herokuapp.com/) 

## Beskrivelse av applikasjon: 
Dette er en liten webapplikasjon for å bestille kinobiletter. Kjøperen må velge en film fra drop-down menu og fylle ut alle feltene for å fullføre kjøpet. Etter fullført kjøp får brukeren oversikt over sine bestilte billetter under "Mine billetter" feltet. Brukeren får feilmelding når det er tomme felter ved bestilling. Etter et kjøp blir bestillingsskjemaet tømt ut slik at man kan registrere en ny billett. Det er brukt en enkel variant av input-validering (uten salting hashing etc).

## Beskrivelse:
Jeg har brukt Spring sine innebygde moduler for å jobbe mot database:
* Spring Data JPA
* H2 "in-memory" Database
* JDBC API (spring-boot-starter-jdbc)

## Eventuelle mangler:
Deployering på Heroku er ikke gjennomført på grunn av sikkerhetsproblemet - problemer med å knytte GitHub-repoer til Heroku-apper.

***
Sirin Koca | OsloMet | 2022

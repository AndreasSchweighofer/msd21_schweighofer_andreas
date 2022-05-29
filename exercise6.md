# Exercise 6

### Was ist notwendig um Maven Site Dokumentationen zu generieren?

- Maven Site plugin in pom.xml (weitere plugins für z.B. Javadoc API-Dokumentation)
- site.xml

### Welche unterschiedlichen Aspekte, Konfigurationen, Informationen, usw. werden in site.xml bzw. pom.xml konfiguriert?

- site.xml: Projekt-Name, Overview, Reports...
- pom.xml: maven-project-info-reports-plugin, maven-site-plugin, maven-javadoc-plugin, jacoco-maven-plugin (für Test-Ergebnisse)
# Exercise 5

### Warum werden Logging Bibliotheken verwendet?

- Damit man log-Informationen in externen log-files speichern kann und dadurch mehr Übersicht hat.

### Welche Loglevel gibt es in Log4J und was hat es damit auf sich?

- ALL – To log all events.
- DEBUG – A general debugging event.
- ERROR – An error in the application, possibly recoverable.
- FATAL – A severe error that will prevent the application from continuing.
- INFO – An event for informational purposes.
- TRACE – A fine-grained debug message, typically capturing the flow through the application.
- WARN – An event that might possibly lead to an error.
- OFF – No events will be logged.

[Quelle: makeseleniumeasy.com](http://makeseleniumeasy.com/2021/03/11/log4j2-tutorial-1-introduction-to-apache-log4j2/)

### Was für Konfigurationsmöglichkeiten bietet Ihnen log4J?

- Wohin die log-Informationen geschrieben werden sollen.
- Auf welche Weise (Uhrzeit, Datum, Message) die Information ausgegeben werden soll.
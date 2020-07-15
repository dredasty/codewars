import ch.qos.logback.classic.Level
import ch.qos.logback.classic.encoder.PatternLayoutEncoder

def byDay = timestamp("yyyyMMdd'T'HHmm")

appender("STDOUT", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{5} - %msg%n"
    }
}

root(Level.DEBUG, ["STDOUT"])
package micronaut.openapi.test.core.factory

import io.micronaut.context.annotation.Factory
import jakarta.inject.Singleton

import java.time.format.DateTimeFormatter

@Factory
class DateTimeFormatterFactory {

    @Singleton
    DateTimeFormatter dateTimeFormatter() {
        return DateTimeFormatter.ISO_INSTANT
    }

}

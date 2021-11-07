package micronaut.openapi.test.core.builder.date

import jakarta.inject.Inject
import jakarta.inject.Singleton
import micronaut.openapi.test.core.builder.UnaryBuilder
import micronaut.openapi.test.domains.date.DateTime

import java.time.Instant
import java.time.format.DateTimeFormatter

@Singleton
class DateTimeBuilder implements UnaryBuilder<Instant, DateTime> {

    @Inject
    DateTimeFormatter dateTimeFormatter

    @Override
    DateTime build(Instant instant) {

        return new DateTime(
                timestamp: instant.epochSecond,
                iso8601: dateTimeFormatter.format(instant)
        )
    }

}

package micronaut.openapi.test.core.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.swagger.v3.oas.annotations.tags.Tag
import jakarta.inject.Inject
import micronaut.openapi.test.core.builder.date.DateTimeBuilder
import micronaut.openapi.test.domains.date.DateTime

import java.time.Instant

@Controller('/api/date')
@Tag(name = 'date')
class DateController {

    @Inject
    DateTimeBuilder dateTimeBuilder

    @Get('/now')
    DateTime now() {

        def now = Instant.now()
        return dateTimeBuilder.build(now)
    }

}

package micronaut.openapi.test.domains.date

import groovy.transform.Canonical
import io.swagger.v3.oas.annotations.media.Schema

@Canonical
@Schema
class DateTime implements Serializable {

    long timestamp

    String iso8601

}

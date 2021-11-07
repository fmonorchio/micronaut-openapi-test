package micronaut.openapi.test.domains.user

import groovy.transform.Canonical
import io.swagger.v3.oas.annotations.media.Schema

@Canonical
@Schema
class User implements Serializable {

    String username

    String firstname

    String lastname

}

package micronaut.openapi.test.service.controller

import groovy.util.logging.Slf4j
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import jakarta.inject.Inject
import micronaut.openapi.test.domains.user.User

@Controller('/api/user')
class UserController {

    @Get
    User user() {

        return new User(
                username: 'fmonorchio',
                firstname: 'frank',
                lastname: 'monorchio'
        )
    }

}

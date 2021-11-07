package micronaut.openapi.test.service

import io.micronaut.openapi.annotation.OpenAPIInclude
import io.micronaut.openapi.annotation.OpenAPIManagement
import io.micronaut.runtime.Micronaut
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.tags.Tag
import micronaut.openapi.test.core.controller.DateController

@OpenAPIDefinition(
        info = @Info(
                title = '${info.title}',
                version = '${info.version}',
                description = '${info.description}'
        )
)
@OpenAPIInclude(
        classes = DateController
)
@OpenAPIManagement(
        tags = @Tag(name = 'Management')
)
class Application {

    static void main(String[] args) {
        Micronaut.build(args)
                .banner(false)
                .start()
    }

}

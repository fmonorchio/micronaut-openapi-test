package micronaut.openapi.test.core.builder

interface UnaryBuilder<S, T> {

    T build(S source)

}

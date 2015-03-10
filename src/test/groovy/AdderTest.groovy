import spock.lang.Specification
import spock.lang.Unroll

class AdderTest extends Specification {
    @Unroll
    def "should add two values"() {
        given: "a new Adder class is created"
        def adder = new Adder();

        expect: "Adding two numbers to return the sum"
        adder.add(3, 4) == 7
    }

    @Unroll
    def "should add two values second part"() {
        given:
        def adder = new Adder()
        when:
        def result = adder.add(3,4);
        then:
        result==7
    }
}

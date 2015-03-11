package firststeps

import spock.lang.Specification
import spock.lang.Unroll

class CalcTest extends Specification {

    //####################### Ways of writing

    def "should add two values"() {
        given: "a new Adder class is created"
        def calc = new Calc();

        expect: "Adding two numbers to return the sum"
        calc.add(3, 4) == 7
    }

    def "should add two values tested in other way"() {
        given:
        def calc = new Calc()

        when:
        def result = calc.add(3,4);

        then:
        result==7
    }

    //####################### Param

    def "should add two positive values parameterized test"() {
        given:
        def calc = new Calc();

        expect:
        calc.add(a,b)==d

        where:
        a   |   b   |   d
        1   |   2   |   3
        3   |   3   |   6
        0   |   0   |   0
    }

    def "should add two negative values parameterized test"() {
        given:
        def calc = new Calc();

        expect:
        calc.add(a,b)==d

        where:
        a   |   b   |   d
        -1  |   -1  |   -2
        -1  |   -5  |   -6
        -5  |   -1  |   -6
    }

    //ok but what if we have 3k rows in data set and we would like to check which exactly fails?
    def "should add two values param test which fails in 5 row but who knows?!"() {
        given:
        def calc = new Calc();

        expect:
        calc.add(a,b)==d

        where:
        a   |   b   |   d
        -1  |   0   |   -1
        -1  |   -1  |   -2
        -1  |   -2  |   -3
        -1  |   -3  |   -4
        -1  |   -4  |   5
        -1  |   -5  |   -6
        -1  |   -6  |   -7
    }

    // so now comes @unroll <3
    @Unroll
    def "should add two values param test which fails in 5 row but we can check that"() {
        given:
        def calc = new Calc();

        expect:
        calc.add(a,b)==d

        where:
        a   |   b   |   d
        -1  |   0   |   -1
        -1  |   -1  |   -2
        -1  |   -2  |   -3
        -1  |   -3  |   -4
        -1  |   -4  |   5
        -1  |   -5  |   -6
        -1  |   -6  |   -7
    }

    /* http://java.dzone.com/articles/testing-java-using-spock - compare with JUnit */

    //####################### Some exceptions?

    @Unroll
    def "should divide first by second value"() {
        given:
        def calc = new Calc();
        expect:
        calc.divide(10,5)==2
    }

    def "should fail because should throw exception when trying to divide by 0"() {
        given:
        def calc = new Calc();

        expect:
        calc.divide(1,0)==0
    }
    //do you remember hack with try catch?!
    /*
        try{
            doSth();
            assert.Fail();
        }catch(Exception e){
            assertThat(e.getMessage().contains("some error"));
        }
     */
    def "should throw exception when trying to divide by 0"() {
        given:
        def calc = new Calc();

        when:
        calc.divide(1,0)

        then:
        thrown(ArithmeticException)

    }


}

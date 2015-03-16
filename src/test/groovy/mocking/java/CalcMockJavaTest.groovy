package mocking.java

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

//@ContextConfiguration(locations = "classpath*:resources/Beans.xml")
@ContextConfiguration(locations = ["classpath:/Beans.xml"])
//@UnitilsSupport Unitils handles transactions using Spring PlatformTransactionManager http://grysz.com/2011/02/15/testing-a-legacy-java-application-with-groovy-spock-spring-test-and-unitils/
class CalcMockJavaTest extends Specification {
    //@Shared def calc;
    def divider;

    @Autowired
    AdderJava adder;

    @Autowired
    CalcMockJava calc;

    /* def setup(){
         divider = Mock(DividerJava);
         calc = new CalcMockJava(adder,divider);
     }*/

    def "should "() {
        expect:
        calc.add(1,2)==3;
    }

}

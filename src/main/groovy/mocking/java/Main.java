package mocking.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
       ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        CalcMockJava calc = (CalcMockJava) context.getBean("calc");

        System.out.println(calc.add(1,2));
    }
}

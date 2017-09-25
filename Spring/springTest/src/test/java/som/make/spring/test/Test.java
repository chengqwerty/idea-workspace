package som.make.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"spring-config1.xml"});
        String springStr = (String)applicationContext.getBean("shiroString");
        System.out.println(springStr);
    }

}

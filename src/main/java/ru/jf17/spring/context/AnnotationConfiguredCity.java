package ru.jf17.spring.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.jf17.spring.context.city.City;

public class AnnotationConfiguredCity {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation-context.xml");
        City city = applicationContext.getBean(City.class);
        System.out.println("city=" + city);

    }
}

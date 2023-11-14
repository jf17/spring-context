package ru.jf17.spring.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.jf17.spring.context.city.City;
import ru.jf17.spring.context.config.CityConfiguration;

public class JavaConfiguredCity {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CityConfiguration.class);
        City city = applicationContext.getBean(City.class);
        System.out.println("city=" + city);
    }
}

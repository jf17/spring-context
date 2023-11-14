package ru.jf17.spring.context.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.jf17.spring.context.city.City;
import ru.jf17.spring.context.city.ElectricitySystem;
import ru.jf17.spring.context.city.IndustrialDistrict;
import ru.jf17.spring.context.city.PipelineSystem;

@Configuration
public class CityConfiguration {
    @Bean
    public ElectricitySystem electricitySystem() {
        return new ElectricitySystem();
    }

    @Bean
    public PipelineSystem pipelineSystem() {
        return new PipelineSystem();
    }

    @Bean
    public IndustrialDistrict industrialDistrict() {
        return new IndustrialDistrict();
    }

    @Bean
    public City city(PipelineSystem pipelineSystem,
                     ElectricitySystem electricitySystem,
                     IndustrialDistrict industrialDistrict) {
        return new City(pipelineSystem, electricitySystem, industrialDistrict);
    }
}

package ru.jf17.spring.context.city;

import org.springframework.beans.factory.annotation.Autowired;

public class City {
    PipelineSystem pipelineSystem;
    ElectricitySystem electricitySystem;
    IndustrialDistrict industrialDistrict;

    public City(@Autowired PipelineSystem pipelineSystem,
                @Autowired ElectricitySystem electricitySystem,
                @Autowired IndustrialDistrict industrialDistrict) {
        this.pipelineSystem = pipelineSystem;
        this.electricitySystem = electricitySystem;
        this.industrialDistrict = industrialDistrict;
    }

    @Override
    public String toString() {
        return "City{" +
                "pipelineSystem=" + pipelineSystem +
                ", electricitySystem=" + electricitySystem +
                ", industrialDistrict=" + industrialDistrict +
                '}';
    }
}

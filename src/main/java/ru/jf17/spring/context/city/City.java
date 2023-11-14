package ru.jf17.spring.context.city;

public class City {
    PipelineSystem pipelineSystem;
    ElectricitySystem electricitySystem;
    IndustrialDistrict industrialDistrict;

    public City(PipelineSystem pipelineSystem, ElectricitySystem electricitySystem, IndustrialDistrict industrialDistrict) {
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

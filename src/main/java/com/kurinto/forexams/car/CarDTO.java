package com.kurinto.forexams.car;

public record CarDTO (
        Integer id,
        String make,
        String model,
        String color,
        Integer year,
        Double price) {


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

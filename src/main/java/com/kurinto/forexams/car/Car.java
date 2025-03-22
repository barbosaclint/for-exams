package com.kurinto.forexams.car;

import jakarta.persistence.*;


@Entity
@Table(
        name = "car",
        uniqueConstraints = @UniqueConstraint(
        name = "unique_make_model",
        columnNames = {"make", "model"}
)
)
public class Car {

    public Car() {
    }

    @Id
    @SequenceGenerator(
            name = "customer_id_seq",
            sequenceName = "customer_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_id_seq"
    )
    private Long id;

    @Column(nullable = false)
    private String make;

    @Column(nullable = false)
    private String model;

    private String color;

    private Integer year;

    @Column(nullable = false)
    private Double price;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String make() {
        return make;
    }

    public Car setMake(String make) {
        this.make = make;
        return this;
    }

    public String model() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public String color() {
        return color;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public Integer year() {
        return year;
    }

    public Car setYear(Integer year) {
        this.year = year;
        return this;
    }

    public Double price() {
        return price;
    }

    public Car setPrice(Double price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

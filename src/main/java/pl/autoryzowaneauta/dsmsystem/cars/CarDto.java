package pl.autoryzowaneauta.dsmsystem.cars;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
public class CarDto {
    private Long id;
    private String brand;
    private String model;
    private String vin;
    private int year;
    private BigDecimal price;
    private int course;
    private String fuelType;
    private String engineCapacity;
    private String transmission;
    private String description;
    private Long dealerId;
}

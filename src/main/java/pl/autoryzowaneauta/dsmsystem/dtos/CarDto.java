package pl.autoryzowaneauta.dsmsystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.autoryzowaneauta.dsmsystem.entities.Dealer;

@AllArgsConstructor
@Getter
public class CarDto {
    private Long id;
    private String brand;
    private String model;
    private String vin;
    private int year;
    private Dealer dealer;
}

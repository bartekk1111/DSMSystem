package pl.autoryzowaneauta.dsmsystem.cars;

import jakarta.persistence.*;
import lombok.*;
import pl.autoryzowaneauta.dsmsystem.dealers.Dealer;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToOne
    @JoinColumn(name = "dealer_id")
    private Dealer dealer;



}

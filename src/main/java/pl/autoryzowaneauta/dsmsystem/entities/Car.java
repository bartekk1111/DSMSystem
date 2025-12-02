package pl.autoryzowaneauta.dsmsystem.entities;

import jakarta.persistence.*;
import lombok.*;

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

    @ManyToOne
    @JoinColumn(name = "dealer_id")
    private Dealer dealer;


}

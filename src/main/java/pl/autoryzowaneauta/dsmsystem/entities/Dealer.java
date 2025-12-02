package pl.autoryzowaneauta.dsmsystem.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name ="dealers")
public class Dealer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String street;

    private String city;

    private String zip;

    @OneToMany(mappedBy = "dealer", cascade = CascadeType.ALL)
    private List<User> users;

    @OneToMany(mappedBy = "dealer", cascade = CascadeType.ALL)
    private List<Car> cars;

}

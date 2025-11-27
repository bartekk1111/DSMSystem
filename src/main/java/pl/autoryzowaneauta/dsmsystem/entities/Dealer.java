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
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "zip")
    private String zip;

    @OneToMany(mappedBy = "dealer", cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<User> users;

}

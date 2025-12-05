package pl.autoryzowaneauta.dsmsystem.users;

import jakarta.persistence.*;
import lombok.*;
import pl.autoryzowaneauta.dsmsystem.dealers.Dealer;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

    @ManyToOne
    @JoinColumn(name = "dealer_id")
    private Dealer dealer;

}

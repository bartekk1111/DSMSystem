package pl.autoryzowaneauta.dsmsystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.autoryzowaneauta.dsmsystem.entities.Car;
import pl.autoryzowaneauta.dsmsystem.entities.User;

import java.util.List;

@AllArgsConstructor
@Getter
public class DealerDto {
    private Long id;
    private String name;
    private String street;
    private String city;
    private String zip;
    private List<User> users;
    private List<Car> cars;
}

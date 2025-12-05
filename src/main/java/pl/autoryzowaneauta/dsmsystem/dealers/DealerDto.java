package pl.autoryzowaneauta.dsmsystem.dealers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.autoryzowaneauta.dsmsystem.cars.CarDto;
import pl.autoryzowaneauta.dsmsystem.users.UserDto;

import java.util.List;

@AllArgsConstructor
@Getter
public class DealerDto {
    private Long id;
    private String name;
    private String street;
    private String city;
    private String zip;
    private List<UserDto> users;
    private List<CarDto> cars;
}

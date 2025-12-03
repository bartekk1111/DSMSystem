package pl.autoryzowaneauta.dsmsystem.mappers;

import org.mapstruct.Mapper;
import pl.autoryzowaneauta.dsmsystem.dtos.CarDto;
import pl.autoryzowaneauta.dsmsystem.entities.Car;

@Mapper(componentModel = "spring")
public interface CarMapper {
    CarDto toDto(Car car);
}

package pl.autoryzowaneauta.dsmsystem.cars;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarMapper {
    CarDto toDto(Car car);
}

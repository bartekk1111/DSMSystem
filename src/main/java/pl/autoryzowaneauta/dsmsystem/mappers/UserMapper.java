package pl.autoryzowaneauta.dsmsystem.mappers;

import org.mapstruct.Mapper;
import pl.autoryzowaneauta.dsmsystem.dtos.UserDto;
import pl.autoryzowaneauta.dsmsystem.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
}

package pl.autoryzowaneauta.dsmsystem.mappers;

import org.mapstruct.Mapper;
import pl.autoryzowaneauta.dsmsystem.dtos.DealerDto;
import pl.autoryzowaneauta.dsmsystem.entities.Dealer;

@Mapper(componentModel = "spring")
public interface DealerMapper {
    DealerDto toDto(Dealer dealer);
}

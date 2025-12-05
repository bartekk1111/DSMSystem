package pl.autoryzowaneauta.dsmsystem.dealers;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DealerMapper {
    DealerDto toDto(Dealer dealer);
}

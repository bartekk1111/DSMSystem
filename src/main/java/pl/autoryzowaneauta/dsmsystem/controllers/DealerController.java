package pl.autoryzowaneauta.dsmsystem.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.autoryzowaneauta.dsmsystem.dtos.DealerDto;
import pl.autoryzowaneauta.dsmsystem.mappers.DealerMapper;
import pl.autoryzowaneauta.dsmsystem.repositories.DealerRepository;

@Controller
@AllArgsConstructor
@RequestMapping("/dealers")
public class DealerController {

    private final DealerRepository dealerRepository;
    private final DealerMapper dealerMapper;

    @GetMapping
    public Iterable<DealerDto> getAllDealers() {
        return dealerRepository.findAll()
                .stream()
                .map(dealerMapper::toDto)
                .toList();
    }

}

package pl.autoryzowaneauta.dsmsystem.dealers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

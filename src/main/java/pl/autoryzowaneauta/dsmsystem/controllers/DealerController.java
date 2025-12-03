package pl.autoryzowaneauta.dsmsystem.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.autoryzowaneauta.dsmsystem.repositories.DealerRepository;

@Controller
@AllArgsConstructor
@RequestMapping("/dealers")
public class DealerController {
    private final DealerRepository dealerRepository;


}

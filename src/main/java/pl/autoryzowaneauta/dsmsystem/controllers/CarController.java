package pl.autoryzowaneauta.dsmsystem.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.autoryzowaneauta.dsmsystem.mappers.CarMapper;
import pl.autoryzowaneauta.dsmsystem.repositories.CarRepository;

@Controller
@RequestMapping("/cars")
@AllArgsConstructor
public class CarController {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public
}

package pl.autoryzowaneauta.dsmsystem.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.autoryzowaneauta.dsmsystem.dtos.CarDto;
import pl.autoryzowaneauta.dsmsystem.mappers.CarMapper;
import pl.autoryzowaneauta.dsmsystem.repositories.CarRepository;

@Controller
@AllArgsConstructor
@RequestMapping("/cars")
public class CarController {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    @GetMapping
    public Iterable<CarDto> getAllCars() {
        return carRepository.findAll()
                .stream()
                .map(carMapper::toDto)
                .toList();
    }

}

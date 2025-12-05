package pl.autoryzowaneauta.dsmsystem.cars;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @GetMapping("/{id}")
    public ResponseEntity<CarDto> getCar(@PathVariable Long id) {
        var car = carRepository.findById(id).orElse(null);
        if (car == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(carMapper.toDto(car));
    }

}

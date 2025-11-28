package pl.autoryzowaneauta.dsmsystem.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.autoryzowaneauta.dsmsystem.entities.Car;

public interface CarRepository extends CrudRepository<Car, Long> {
}

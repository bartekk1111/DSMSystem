package pl.autoryzowaneauta.dsmsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.autoryzowaneauta.dsmsystem.entities.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}

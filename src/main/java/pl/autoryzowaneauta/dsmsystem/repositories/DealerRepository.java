package pl.autoryzowaneauta.dsmsystem.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.autoryzowaneauta.dsmsystem.entities.Dealer;

public interface DealerRepository extends CrudRepository <Dealer, Long> {
}

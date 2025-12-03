package pl.autoryzowaneauta.dsmsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.autoryzowaneauta.dsmsystem.entities.Dealer;

public interface DealerRepository extends JpaRepository<Dealer, Long> {
}

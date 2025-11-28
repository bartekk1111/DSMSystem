package pl.autoryzowaneauta.dsmsystem.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.autoryzowaneauta.dsmsystem.entities.User;

public interface UserInterface extends CrudRepository <User, Long> {
}

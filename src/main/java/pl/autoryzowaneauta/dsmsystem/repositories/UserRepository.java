package pl.autoryzowaneauta.dsmsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import pl.autoryzowaneauta.dsmsystem.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

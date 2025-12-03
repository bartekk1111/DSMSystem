package pl.autoryzowaneauta.dsmsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.autoryzowaneauta.dsmsystem.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

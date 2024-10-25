package ca.devpro.saskpolytech;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

public interface StarWarsCharacterRepository extends ListCrudRepository<StarWarsCharacter, String> {
}

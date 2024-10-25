package ca.devpro.saskpolytech;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/star-wars-characters")
@RequiredArgsConstructor
public class StartWarsCharacterController {

	private final StarWarsCharacterRepository repo;

	@GetMapping
	public List<StarWarsCharacter> findAll() {
		return repo.findAll();
	}

	@PostMapping
	public StarWarsCharacter create(@RequestBody StarWarsCharacter starWarsCharacter) {
		return repo.save(starWarsCharacter);
	}

}

package ca.devpro.saskpolytech;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.annotation.DirtiesContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class StarWarsCharacterControllerTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testFindAll() {
		StarWarsCharacter[] starWarsCharacters = restTemplate.getForObject("/api/star-wars-characters", StarWarsCharacter[].class);
		assertEquals(10, starWarsCharacters.length);
	}

	@Test
	public void testCreateJarJarBinks() {
		StarWarsCharacter jarJarBinks = new StarWarsCharacter()
				.setName("Jar Jar Binks")
				.setSpecies("Gungan")
				.setHomeWorld("Naboo")
				.setAffiliation("Galactic Republic");

		StarWarsCharacter createdStarWarsCharacter = restTemplate.postForObject("/api/star-wars-characters", jarJarBinks, StarWarsCharacter.class);
		assertNotNull(createdStarWarsCharacter.getCharacterId());

		StarWarsCharacter[] starWarsCharacters = restTemplate.getForObject("/api/star-wars-characters", StarWarsCharacter[].class);
		assertEquals(11, starWarsCharacters.length);
	}

}

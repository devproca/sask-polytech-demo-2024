package ca.devpro.saskpolytech;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

@Data
@Accessors(chain = true)
public class StarWarsCharacter {
	@Id
	private Long characterId;
	private String name;
	private String species;
	private String homeWorld;
	private String affiliation;
}

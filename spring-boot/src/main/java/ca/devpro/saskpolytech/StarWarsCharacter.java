package ca.devpro.saskpolytech;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class StarWarsCharacter {
	private Long characterId;
	private String name;
	private String species;
	private String homeWorld;
	private String affiliation;
}

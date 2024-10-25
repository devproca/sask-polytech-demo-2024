package ca.devpro;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class LombokFruit {
	@Getter
	private String type;
	@Getter
	@Setter
	private String colour;

}

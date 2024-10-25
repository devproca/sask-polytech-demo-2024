package ca.devpro;

import lombok.Getter;

import java.util.Objects;

public class Fruit {
	private String type;
	private String colour;

	public Fruit(String type, String colour) {
		this.type = type;
		this.colour = colour;
	}

	public String getType() {
		return type;
	}

	public String getColour() {
		return colour;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Fruit fruit = (Fruit) o;
		return Objects.equals(type, fruit.type) && Objects.equals(colour, fruit.colour);
	}

	@Override
	public int hashCode() {
		int result = Objects.hashCode(type);
		result = 31 * result + Objects.hashCode(colour);
		return result;
	}

}

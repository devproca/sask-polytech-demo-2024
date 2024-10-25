package ca.devpro.saskpolytech;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloWorldControllerTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testHelloWorld() {
		String response = restTemplate.getForObject("/api/hello", String.class);

		assertEquals("Hello world!", response);
	}

}

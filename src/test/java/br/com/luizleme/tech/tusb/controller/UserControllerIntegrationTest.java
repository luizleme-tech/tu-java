package br.com.luizleme.tech.tusb.controller;

import br.com.luizleme.tech.tusb.domain.User;
import br.com.luizleme.tech.tusb.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerIntegrationTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Autowired
	private UserRepository userRepository;

	@BeforeEach
	void setUp() {
		User user = new User(1L, "Madruga", "madruga@gmail.com");
		userRepository.save(user);
	}

	@Test
	void deveBuscarUmUsuarioPeloIdNaApi() {
		ResponseEntity<User> response = testRestTemplate.getForEntity("/api/users/1", User.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
	}
}
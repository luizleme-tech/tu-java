package br.com.luizleme.tech.tusb.repository;

import br.com.luizleme.tech.tusb.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.jupiter.api.Assertions.*;

@Testcontainers
@DataJpaTest
@ActiveProfiles("integration-test")
class UserRepositoryContainerTest {

	@Container
	public static PostgreSQLContainer<?> postgreSQLContainer = new PostgreSQLContainer<>("postgres:latest")
			.withDatabaseName("integration-tests-db")
			.withUsername("sa")
			.withPassword("sa");

	@Autowired
	private UserRepository userRepository;


	@DynamicPropertySource
	static void setDatasourceProperties(DynamicPropertyRegistry registry) {
		registry.add("spring.datasource.url", postgreSQLContainer::getJdbcUrl);
		registry.add("spring.datasource.username", postgreSQLContainer::getUsername);
		registry.add("spring.datasource.password", postgreSQLContainer::getPassword);
	}
	@Test
	void deveSalvarUsuarioNaBase() {
		var user = new User("Godines", "godines@gmail.com");
		var saved = userRepository.save(user);
		assertNotNull(saved.getId());
	}
}
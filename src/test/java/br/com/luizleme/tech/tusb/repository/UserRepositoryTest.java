package br.com.luizleme.tech.tusb.repository;

import br.com.luizleme.tech.tusb.domain.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class UserRepositoryTest {

	@Autowired
	private TestEntityManager testEntityManager;
	@Autowired
	private UserRepository userRepository;

	@Test
	void deveEncontrarUsuarioPorId() {
		var user = new User("Girafales", "girafales@escolinha.com");
		testEntityManager.persistAndFlush(user);
		User userFounded = userRepository.findById(user.getId()).orElse(null);
		Assertions.assertThat(userFounded).isNotNull();
		Assertions.assertThat(userFounded.getName()).isEqualTo(user.getName());
	}
}
package br.com.luizleme.tech.tusb.service;

import br.com.luizleme.tech.tusb.domain.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test
	@WithMockUser(roles = {"ADMIN"})
	void deveDeletarUmUsuario() {
		var user = new User("Jaiminho", "jaiminho.carteiro@tangamandapio.com");
		User saved = userService.createUser(user);

		userService.deleteUser(saved.getId());
	}
}
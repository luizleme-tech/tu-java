package br.com.luizleme.tech.tusb;

import br.com.luizleme.tech.tusb.domain.User;
import br.com.luizleme.tech.tusb.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private UserService userService;

	@Test
	void deveCriarUmUsuario() throws Exception {
		User user = new User("Florinda", "florinda@gmail.com");

		when(userService.createUser(any(User.class))).thenReturn(user);

		mockMvc.perform(
						post("/api/users")
								.contentType("application/json")
								.content("{\"name\": \"Florinda\", \"email\": \"florinda@gmail.com\"}"))
				.andExpect(status().isCreated())
				.andExpect(jsonPath("$.name").value("Florinda"))
				.andExpect(jsonPath("$.email").value("florinda@gmail.com"));

	}
}

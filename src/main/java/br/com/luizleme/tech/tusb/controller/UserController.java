package br.com.luizleme.tech.tusb.controller;

import br.com.luizleme.tech.tusb.domain.User;
import br.com.luizleme.tech.tusb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		var userCreated = userService.createUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
	}

	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable long id) {
		var user = userService.getUserById(id);
		return ResponseEntity.ok(user);
	}
}

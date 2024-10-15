package br.com.luizleme.tech.tusb.service;

import br.com.luizleme.tech.tusb.domain.User;
import br.com.luizleme.tech.tusb.exception.ResourceNotFoundException;
import br.com.luizleme.tech.tusb.repository.UserRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User createUser(User user) {
		return userRepository.save(user);
	}

	@SneakyThrows
	public User getUserById(long id) {
		return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
	}
}

package br.com.luizleme.tech.tusb.repository;

import br.com.luizleme.tech.tusb.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {
}

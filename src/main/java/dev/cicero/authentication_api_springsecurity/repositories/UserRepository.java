package dev.cicero.authentication_api_springsecurity.repositories;

import dev.cicero.authentication_api_springsecurity.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {


}

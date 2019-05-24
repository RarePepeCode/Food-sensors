package ProjektoModelis.Repositories;

import ProjektoModelis.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> { }
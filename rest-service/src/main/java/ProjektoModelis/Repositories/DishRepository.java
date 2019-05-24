package ProjektoModelis.Repositories;

import ProjektoModelis.Models.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Integer> { }
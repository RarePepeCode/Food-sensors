package ProjektoModelis.Repositories;

import ProjektoModelis.Models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

    @Query(value = "SELECT * FROM Recipe r WHERE r.pavadinimas LIKE %:pavadinimas% and r.aprasymas LIKE %:aprasymas%", nativeQuery = true)
    List<Recipe> getAllRecipes(@Param("pavadinimas") String pavadinimas, @Param("aprasymas") String aprasymas);

    @Query(value = "SELECT * FROM Recipe r WHERE r.fk_course_id = :id", nativeQuery = true)
    List<Recipe> getAllCoursesRecipes(@Param("id") Integer id);
}
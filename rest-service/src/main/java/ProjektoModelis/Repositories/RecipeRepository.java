package ProjektoModelis.Repositories;

import ProjektoModelis.Models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

    @Query(value = "SELECT * FROM recipe WHERE pavadinimas LIKE '%?1%' and aprasymas LIKE '%?2%'", nativeQuery = true)
    List<Recipe> getAllRecipes(String pavadinimas, String aprasymas);

}
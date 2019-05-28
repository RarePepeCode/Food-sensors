/**
 * @(#) RecipeController.java
 */

package ProjektoModelis.Controllers;

import ProjektoModelis.Repositories.RecipeRepository;
import ProjektoModelis.View.Administrator.CreateRecipe;
import ProjektoModelis.Models.Recipe;
import ProjektoModelis.View.Main.RecipePage;
import ProjektoModelis.View.Main.RecipeSearchPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/recipes")
@CrossOrigin(origins = "http://localhost:4200")
public class RecipeController
{
	private CreateRecipe createRecipe;
	
	private RecipeSearchPage recipeSearchPage;
	
	private RecipePage recipePage;
	
	private Recipe recipe;

	@Autowired
	private RecipeRepository recipeRepository;
	
	public void openCreateRecipePage( )
	{
		
	}
	
	public void createRecipe( )
	{
		
	}
	
	public void validateData( )
	{
		
	}
	
	public void openSuggestedRecipes( )
	{
		
	}
	
	public void openRecipeSearchPage( )
	{
		
	}
	
	public void validateRecipe( )
	{
		
	}

	@RequestMapping(value = {"/searchRecipes"}, method = RequestMethod.GET)
	public List<Recipe> searchRecipes(@RequestParam(value="pavadinimas", required=true) String pavadinimas,
									  @RequestParam(value="aprasymas", required=true) String aprasymas) {
		return this.recipeRepository.getAllRecipes(pavadinimas, aprasymas);
	}
	
	public void openSelectedRecipe( )
	{
		
	}
	
	public void openRecipeSuggestion( )
	{
		
	}
	
	public void submitRecipe( )
	{
		
	}
	
	public void deleteRecipe( )
	{
		
	}
	
	public void showAllRecipes( )
	{
		
	}
	
	public void editRecipe( )
	{
		
	}
	
	
}

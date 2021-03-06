/**
 * @(#) RecipeController.java
 */

package ProjektoModelis.Controllers;

import ProjektoModelis.Models.Course;
import ProjektoModelis.Repositories.CourseRepository;
import ProjektoModelis.Repositories.RecipeRepository;
import ProjektoModelis.View.Administrator.CreateRecipe;
import ProjektoModelis.Models.Recipe;
import ProjektoModelis.View.Main.RecipePage;
import ProjektoModelis.View.Main.RecipeSearchPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
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

	@Autowired
	private CourseRepository courseRepository;
	
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

	@RequestMapping(value = "/getRecipe/{id}", method = RequestMethod.GET)
	public Optional<Recipe> getRecipe(@PathVariable("id") Integer id) {
		return this.recipeRepository.findById(id);
	}

	@RequestMapping(value = "/recipesForNewCourse", method = RequestMethod.GET)
	public List<Recipe> getRecipesForNewCourse( )
	{
		List<Recipe> allRecipes = this.recipeRepository.findAll();
		return findRecipesWithoutCourses(allRecipes);
	}

	@RequestMapping(value = "/getAllCoursesRecipes/{id}", method = RequestMethod.GET)
	public List<Recipe> getAllCoursesRecipes(@PathVariable("id") Integer id)
	{
		return this.recipeRepository.getAllCoursesRecipes(id);
	}

	@RequestMapping(value = "/deleteRecipe/{id}", method = RequestMethod.DELETE)
	public void deleteRecipe(@PathVariable("id") Integer id )
	{
		recipeRepository.deleteById(id);
	}

	@RequestMapping(value = "/saveRecipe", method = RequestMethod.POST)
	public void saveRecipe(@RequestBody  Recipe recipe )
	{
		recipeRepository.save(recipe);
	}

	@RequestMapping(value = "/saveCoursesRecipes/{id}", method = RequestMethod.POST)
	public void saveCoursesRecipes(@RequestBody  List<Recipe> recipes, @PathVariable("id") Integer id )
	{
		recipeRepository.saveAll(recipes);
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

	private List<Recipe> filterOutCoursesReicpes (List<Recipe> allRecipes, List<Recipe> courseRecipes)
	{
		List<Recipe> filteredRecipes = new ArrayList<Recipe>();
		for (Recipe recipe : allRecipes)
		{
			if (!courseRecipes.contains(recipe))
			{
				filteredRecipes.add(recipe);
			}
		}
		return  filteredRecipes;
	}

	private List<Recipe> findRecipesWithoutCourses(List<Recipe> recipes)
	{
		List<Recipe> filteredRecipes = new ArrayList<Recipe>();
		for(Recipe recipe : recipes)
		{
			if (recipe.getCourse() == null)
				filteredRecipes.add(recipe);
		}
		return filteredRecipes;
	}

	
}

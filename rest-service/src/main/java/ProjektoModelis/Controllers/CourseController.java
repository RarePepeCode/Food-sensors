/**
 * @(#) CourseController.java
 */

package ProjektoModelis.Controllers;

import ProjektoModelis.Models.Dish;
import ProjektoModelis.Models.Recipe;
import ProjektoModelis.Repositories.CourseRepository;
import ProjektoModelis.Repositories.DishRepository;
import ProjektoModelis.Repositories.RecipeRepository;
import ProjektoModelis.View.Administrator.SuggestedCourses;
import ProjektoModelis.View.Main.CoursePage;
import ProjektoModelis.View.Main.CourseExercisePage;
import ProjektoModelis.Models.Course;
import ProjektoModelis.View.Administrator.CreateCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/courses")
@CrossOrigin(origins = "http://localhost:4200")
public class CourseController
{
	private CreateCourse createCourse;
	
	private CoursePage coursePage;
	
	private CourseExercisePage courseExercisePage;
	
	private SuggestedCourses suggestedCourses;
	
	private Course course;
	
	private Dish dish;

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private RecipeRepository recipeRepository;

	@Autowired
	private DishRepository dishRepository;

	public void openCreateCourse( )
	{
		
	}
	
	public void submitData( )
	{
		
	}
	
	public void selectOneRecipe( )
	{
		
	}
	
	public void validateData( )
	{
		
	}
	
	public final void openCourse( )
	{
		
	}
	
	public void selectCourse( )
	{
		
	}
	
	public void openSuggestedCourses( )
	{
		
	}
	
	public void validateCourse( )
	{
		
	}
	
	public void openCourseSuggestion( )
	{
		
	}
	
	public void submitCourse( )
	{
		
	}

	@RequestMapping(value = "/searchCourses", method = RequestMethod.GET)
	public List<Course> searchCourses( )
	{
		return this.courseRepository.findAll();
	}

	@RequestMapping(value = "/getCourse/{id}", method = RequestMethod.GET)
	public Optional<Course> searchCourses(@PathVariable("id") Integer id )
	{
		return this.courseRepository.findById(id);
	}

	@RequestMapping(value = "/deleteCourse/{id}", method = RequestMethod.DELETE)
	public void deleteCourse(@PathVariable("id") Integer id )
	{
		courseRepository.deleteById(id);
	}

	@RequestMapping(value = "/saveCourse", method = RequestMethod.POST)
	public void saveCourse(@RequestBody  Course course )
	{
		System.out.println(course.toString());
		courseRepository.save(course);
		mapRecipesWithCourses(course);

	}


	public void deleteCourse( )
	{
		
	}
	
	public void rateCourse( )
	{
		
	}
	
	public void editCourse( )
	{
		
	}
	
	public void saveDishData( )
	{
		
	}

	private void mapRecipesWithCourses(Course course)
	{
		for (Recipe recipe: course.getRecipes())
		{
			Optional<Recipe> oldRecipe = recipeRepository.findById(recipe.getId());
			oldRecipe.get().setCourses(course);
			recipeRepository.save(oldRecipe.get());
		}
	}

	
	
}

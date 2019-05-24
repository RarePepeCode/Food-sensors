/**
 * @(#) CourseController.java
 */

package ProjektoModelis.Controllers;

import ProjektoModelis.Models.Dish;
import ProjektoModelis.Repositories.CourseRepository;
import ProjektoModelis.Repositories.DishRepository;
import ProjektoModelis.View.Administrator.SuggestedCourses;
import ProjektoModelis.View.Main.CoursePage;
import ProjektoModelis.View.Main.CourseExercisePage;
import ProjektoModelis.Models.Course;
import ProjektoModelis.View.Administrator.CreateCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/courses")
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
	
	public void searchCourses( )
	{
		
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
	
	
}

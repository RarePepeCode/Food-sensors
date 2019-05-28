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

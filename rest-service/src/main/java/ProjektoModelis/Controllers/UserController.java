/**
 * @(#) UserController.java
 */

package ProjektoModelis.Controllers;

import ProjektoModelis.Models.Recipe;
import ProjektoModelis.Models.User;
import ProjektoModelis.Repositories.UserRepository;
import ProjektoModelis.View.Administrator.UserPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController
{
	private UserPage userPage;

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/addCourse", method = RequestMethod.GET)
	public Integer registerToCourse(@RequestParam(value="id", required=true) Integer id,
								 @RequestParam(value="courseId", required=true) Integer courseId) {
		userRepository.addCourse(id, courseId);
		return userRepository.getCourseId(id);
	}

	public void openUserListPage( )
	{
		
	}
	
	public void openUserPage( )
	{
		
	}
	
	public void updateUserData( )
	{
		
	}
	
	public void validateData( )
	{
		
	}
	
	
}

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

import java.util.Optional;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController
{
	private UserPage userPage;

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/addCourse", method = RequestMethod.PUT)
	public void registerToCourse(@RequestBody User user) {
		Optional<User> savedUser = userRepository.findById(user.getId());

//		if (savedUser.isPresent()) {
//			savedUser.get().setCourseId(user.getCourseId());
//		}

		userRepository.save(savedUser.get());
	}

//
//	public void saveRecipe(@RequestBody Recipe recipe )
//	{
//		recipeRepository.save(recipe);
//	}
	
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

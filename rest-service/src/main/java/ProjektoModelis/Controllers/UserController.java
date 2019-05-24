/**
 * @(#) UserController.java
 */

package ProjektoModelis.Controllers;

import ProjektoModelis.Repositories.UserRepository;
import ProjektoModelis.View.Administrator.UserPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class UserController
{
	private UserPage userPage;

	@Autowired
	private UserRepository userRepository;
	
	public void registerToCourse( )
	{
		
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

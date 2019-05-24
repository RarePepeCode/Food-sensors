/**
 * @(#) RegistrationController.java
 */

package ProjektoModelis.Controllers;

import ProjektoModelis.Repositories.UserRepository;
import ProjektoModelis.View.Main.RegistrationPage;
import ProjektoModelis.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/registration")
public class RegistrationController
{
	private RegistrationPage registrationPage;
	
	private User user;

	@Autowired
	private UserRepository userRepository;
	
	public void openRegistration( )
	{
		
	}
	
	public void register( )
	{
		
	}
	
	public void validateData( )
	{
		
	}
	
	
}

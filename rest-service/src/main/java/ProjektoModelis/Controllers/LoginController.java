/**
 * @(#) LoginController.java
 */

package ProjektoModelis.Controllers;

import ProjektoModelis.Models.User;
import ProjektoModelis.Repositories.UserRepository;
import ProjektoModelis.View.Main.LoginPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/login")
public class LoginController
{
	private LoginPage loginPage;
	
	private User user;

	@Autowired
	public UserRepository userRepository;

	public void openLoginPage( )
	{
		
	}
	
	public void login( )
	{
		
	}
	
	public void validateUser( )
	{
		
	}
	
	
}

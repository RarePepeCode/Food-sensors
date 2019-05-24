/**
 * @(#) DishController.java
 */

package ProjektoModelis.Controllers;

import ProjektoModelis.Repositories.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/dishes")
public class DishController
{
	@Autowired
	private DishRepository dishRepository;

	public void saveDishData( )
	{
		
	}
	
	
}

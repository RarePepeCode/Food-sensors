/**
 * @(#) SensorController.java
 */

package ProjektoModelis.Controllers;

import ProjektoModelis.Models.Dish;
import ProjektoModelis.Repositories.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/sensor")
public class SensorController
{
	private DishController dishController;
	
	private Dish dish;

	@Autowired
	private DishRepository dishRepository;
	
	public void sendSensorData( )
	{
		
	}
	
	public void validateSensorData( )
	{
		
	}
	
	public void activateScentSensor( )
	{
		
	}
	
	
}

/**
 * @(#) CommentController.java
 */

package ProjektoModelis.Controllers;

import ProjektoModelis.Models.Comment;
import ProjektoModelis.Repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/comments")
public class CommentController
{
	private Comment comment;

	@Autowired
	private CommentRepository commentRepository;

	public void comment( )
	{

	}
	
	public void rate( )
	{
		
	}
	
	
}

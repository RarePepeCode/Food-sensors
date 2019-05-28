/**
 * @(#) CommentController.java
 */

package ProjektoModelis.Controllers;

import ProjektoModelis.Models.Comment;
import ProjektoModelis.Repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/comments")
@CrossOrigin(origins = "http://localhost:4200")
public class CommentController
{
	private Comment comment;

	@Autowired
	private CommentRepository commentRepository;

	@ResponseBody
	@RequestMapping(value = "/comment", method = RequestMethod.POST)
	public int comment(@RequestBody Comment comment) {
		Comment savedComment = commentRepository.save(comment);

		return savedComment.getId();
	}

	@ResponseBody
	@RequestMapping(value = "/rate", method = RequestMethod.POST)
	public int rate(@RequestBody Comment rate) {
		Comment savedRating = commentRepository.save(rate);

		return savedRating.getId();
	}
	
	
}

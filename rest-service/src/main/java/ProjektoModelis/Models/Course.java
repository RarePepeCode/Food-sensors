/**
 * @(#) Course.java
 */

package ProjektoModelis.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;

	private String pavadinimas;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "course_user", joinColumns = {
			@JoinColumn(name = "course_id", nullable = false, updatable = false)
	}, inverseJoinColumns = { @JoinColumn(name = "user_id",
			nullable = false, updatable = false) })
	private List<User> users;
	
	private Integer ivertinimas;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "course_recipe", joinColumns = {
			@JoinColumn(name = "course_id", nullable = false, updatable = false)
			}, inverseJoinColumns = { @JoinColumn(name = "recipe_id",
					nullable = false, updatable = false) })
	private List<Recipe> recipes;

	@OneToMany(mappedBy="course", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Comment> comments;
	
	private String aprasymas;
	
	public void saveCourse( )
	{
		
	}
	
	public void getCourse( )
	{
		
	}
	
	public void setCourseRecipe( )
	{
		
	}
	
	public void getSuggestedCourses( )
	{
		
	}
	
	public void getAllCourses( )
	{
		
	}
	
	public void delete( )
	{
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Integer getIvertinimas() {
		return ivertinimas;
	}

	public void setIvertinimas(Integer ivertinimas) {
		this.ivertinimas = ivertinimas;
	}

	public List<Recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public String getAprasymas() {
		return aprasymas;
	}

	public void setAprasymas(String aprasymas) {
		this.aprasymas = aprasymas;
	}
}

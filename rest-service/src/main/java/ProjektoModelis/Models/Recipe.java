/**
 * @(#) Recipe.java
 */

package ProjektoModelis.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Recipe
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;

	private String pavadinimas;
	
	private String aprasymas;
	
	private Integer sudetingumas;

	@OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
	private List<Dish> patiekalas_pagamintas_pagal_recepta;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "recipes")
	private List<Course> courses;

	@OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
	private List<Comment> comments;
	
	private Integer max_patirties_tasku;
	
	private States busena;
	
	public void saveRecipe( )
	{
		
	}
	
	public void getAllRecipes( )
	{
		
	}
	
	public void getSuggestedRecipes( )
	{
		
	}
	
	public void getRecipe( )
	{
		
	}
	
	public void get3Recipes( )
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

	public String getAprasymas() {
		return aprasymas;
	}

	public void setAprasymas(String aprasymas) {
		this.aprasymas = aprasymas;
	}

	public Integer getSudetingumas() {
		return sudetingumas;
	}

	public void setSudetingumas(Integer sudetingumas) {
		this.sudetingumas = sudetingumas;
	}

	public List<Dish> getPatiekalas_pagamintas_pagal_recepta() {
		return patiekalas_pagamintas_pagal_recepta;
	}

	public void setPatiekalas_pagamintas_pagal_recepta(List<Dish> patiekalas_pagamintas_pagal_recepta) {
		this.patiekalas_pagamintas_pagal_recepta = patiekalas_pagamintas_pagal_recepta;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public Integer getMax_patirties_tasku() {
		return max_patirties_tasku;
	}

	public void setMax_patirties_tasku(Integer max_patirties_tasku) {
		this.max_patirties_tasku = max_patirties_tasku;
	}

	public States getBusena() {
		return busena;
	}

	public void setBusena(States busena) {
		this.busena = busena;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}

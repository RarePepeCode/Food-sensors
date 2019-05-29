/**
 * @(#) Recipe.java
 */

package ProjektoModelis.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Recipe
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;

	private String pavadinimas;
	
	private String aprasymas;
	
	private Integer sudetingumas;

	@OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Dish> patiekalas_pagamintas_pagal_recepta;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_course_id")
	private Course course;

	@OneToMany(mappedBy = "recipe", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Comment> comments;
	
	private Integer max_patirties_tasku;
	
	private States busena;

	private boolean patvirtintas;
	
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

	public Course getCourse() {
		return course;
	}

	public void setCourses(Course course) {
		this.course = course;
	}

	public boolean getPatvirtintas() {
		return patvirtintas;
	}

	public void setPatvirtintas(boolean patvirtintas) {
		this.patvirtintas = patvirtintas;
	}
}

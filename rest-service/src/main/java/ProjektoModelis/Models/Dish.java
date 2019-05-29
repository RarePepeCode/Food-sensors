/**
 * @(#) Dish.java
 */

package ProjektoModelis.Models;

import javax.persistence.*;

@Entity
public class Dish
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;

	private double ivertinimas;
	
	private String patiekalo_informacija;

	@OneToOne(mappedBy = "naudotojo_pagamintas_patiekalas", cascade = CascadeType.ALL,
			fetch = FetchType.LAZY, optional = false)
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_recipe")
	private Recipe recipe;
	
	public void saveDishData( )
	{
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getIvertinimas() {
		return ivertinimas;
	}

	public void setIvertinimas(double ivertinimas) {
		this.ivertinimas = ivertinimas;
	}

	public String getPatiekalo_informacija() {
		return patiekalo_informacija;
	}

	public void setPatiekalo_informacija(String patiekalo_informacija) {
		this.patiekalo_informacija = patiekalo_informacija;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
}

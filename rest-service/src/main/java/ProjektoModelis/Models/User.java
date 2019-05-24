/**
 * @(#) User.java
 */

package ProjektoModelis.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class User
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;

	private String vardas;
	
	private String slaptazodis;
	
	private Integer patirties_taskai;
	
	private String email;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "users")
	private List<Course> naudotojo_lankomas_kursas;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Dish> naudotojo_pagamintas_patiekalas;

	private States busena;

	@OneToMany(mappedBy = "naudotojas_paraso_komentara", cascade = CascadeType.ALL)
	private List<Comment> comments;
	
	public void checkIfExists( )
	{
		
	}
	
	public void save( )
	{
		
	}
	
	public void findUser( )
	{
		
	}
	
	public void addCourse( )
	{
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVardas() {
		return vardas;
	}

	public void setVardas(String vardas) {
		this.vardas = vardas;
	}

	public String getSlaptazodis() {
		return slaptazodis;
	}

	public void setSlaptazodis(String slaptazodis) {
		this.slaptazodis = slaptazodis;
	}

	public Integer getPatirties_taskai() {
		return patirties_taskai;
	}

	public void setPatirties_taskai(Integer patirties_taskai) {
		this.patirties_taskai = patirties_taskai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Course> getNaudotojo_lankomas_kursas() {
		return naudotojo_lankomas_kursas;
	}

	public void setNaudotojo_lankomas_kursas(List<Course> naudotojo_lankomas_kursas) {
		this.naudotojo_lankomas_kursas = naudotojo_lankomas_kursas;
	}

	public List<Dish> getNaudotojo_pagamintas_patiekalas() {
		return naudotojo_pagamintas_patiekalas;
	}

	public void setNaudotojo_pagamintas_patiekalas(List<Dish> naudotojo_pagamintas_patiekalas) {
		this.naudotojo_pagamintas_patiekalas = naudotojo_pagamintas_patiekalas;
	}

	public States getBusena() {
		return busena;
	}

	public void setBusena(States busena) {
		this.busena = busena;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
}

/**
 * @(#) Comment.java
 */

package ProjektoModelis.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Comment
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String komentaras;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "fk_recipe")
	private Recipe recipe;
	
	private Integer ivertinimas;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_naudotojas_paraso_komentara")
	private User naudotojas_paraso_komentara;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_course")
	private Course course;
	
	public void save( )
	{
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKomentaras() {
		return komentaras;
	}

	public void setKomentaras(String komentaras) {
		this.komentaras = komentaras;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public Integer getIvertinimas() {
		return ivertinimas;
	}

	public void setIvertinimas(Integer ivertinimas) {
		this.ivertinimas = ivertinimas;
	}

	public User getNaudotojas_paraso_komentara() {
		return naudotojas_paraso_komentara;
	}

	public void setNaudotojas_paraso_komentara(User naudotojas_paraso_komentara) {
		this.naudotojas_paraso_komentara = naudotojas_paraso_komentara;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
}

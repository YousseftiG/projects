package com.app.business.bo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Permet de d�finir un rayon dans la biblioth�que
 * 
 * @author BOUDAA
 *
 */
@Entity
public class Rayon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRayon;

	private String nom;
	
	
	@OneToMany(fetch=FetchType.LAZY)
	private List<Theme> themes;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Theme> getThemes() {
		return themes;
	}

	public void setThemes(List<Theme> themes) {
		this.themes = themes;
	}

	public Long getIdRayon() {
		return idRayon;
	}

	public void setIdRayon(Long idRayon) {
		this.idRayon = idRayon;
	}

}

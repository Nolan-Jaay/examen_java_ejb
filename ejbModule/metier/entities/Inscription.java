package metier.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;
import metier.entities.Etablissement;
import metier.entities.Examen;

/**
 * Entity implementation class for Entity: Inscription
 *
 */
@Entity

public class Inscription implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;
	private String nom;
	private Date dateNaissance;
	
	@ManyToOne
	private Examen examen;
	
	@ManyToOne
	private Etablissement etablissement;
	
	private static final long serialVersionUID = 1L;

	public Inscription() {
		super();
	}   
	
	public Inscription(Integer id, String nom, Date dateNaissance, Examen examen, Etablissement etablissement) {
		super();
		this.id = id;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.examen = examen;
		this.etablissement = etablissement;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public Date getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}   
	public Examen getExamen() {
		return this.examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}   
	public Etablissement getEtablissement() {
		return this.etablissement;
	}

	public void setEtablissement(Etablissement etablissement) {
		this.etablissement = etablissement;
	}
	
   
}

package metier.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Etablissement
 *
 */
@Entity

public class Etablissement implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;
	private String code;
	private String nom;
	private String adresse;
	private String ville;
	
	@OneToMany(mappedBy = "etablissement")
	private Set<Inscription> inscriptions;
	private static final long serialVersionUID = 1L;

	public Etablissement() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}   
	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	public Set<Inscription> getInscriptions() {
		return inscriptions;
	}
	public void setInscriptions(Set<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}
	public Etablissement(Integer id, String code, String nom, String adresse, String ville) {
		super();
		this.id = id;
		this.code = code;
		this.nom = nom;
		this.adresse = adresse;
		this.ville = ville;
	}
	public Etablissement(Integer id) {
		super();
		this.id = id;
	}
	
   
}

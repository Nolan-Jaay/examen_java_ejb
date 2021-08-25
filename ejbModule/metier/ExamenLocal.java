package metier;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Etablissement;
import metier.entities.Examen;
import metier.entities.Inscription;

@Local
public interface ExamenLocal {

	// examens
	
	public List<Examen> getExamens();

	public Examen getExamensById(Integer id);

	public Examen saveExamen(Examen examen);

	public Examen editExamen(Integer id, Examen examen);

	public void deleteExamen(Integer id);
	

	// etalissements
	public List<Etablissement> getEtablissements();

	public Etablissement getEtablissementsById(Integer id);

	public Etablissement saveEtablissement(Etablissement etablissement);

	public Etablissement editEtablissement(Integer id, Etablissement etablissement);

	public void deleteEtablissement(Integer id);
	

	// inscriptions
	public List<Inscription> getInscriptions();

	public Inscription getInscriptionsById(Integer id);

	public Inscription saveInscription(Inscription inscription);

	public Inscription editInscription(Integer id, Inscription inscription);

	public void deleteInscription(Integer id);
}

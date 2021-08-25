package metier;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.Etablissement;
import metier.entities.Examen;
import metier.entities.Inscription;

@Stateless(name = "EX")
public class ExamenEJBImpl implements ExamenLocal, ExamenRemote{

	@PersistenceContext(unitName = "Examen_EJB")
	private EntityManager entityManager;
	
	@Override
	public List<Examen> getExamens() {
		Query query = entityManager.createQuery("select ex from Examen ex");
		return query.getResultList();
	}

	@Override
	public Examen getExamensById(Integer id) {
		Examen exam = entityManager.find(Examen.class, id);
		if (exam == null) {
			throw new RuntimeException("Examen introuvable");
		}
		return exam;
	}

	@Override
	public Examen saveExamen(Examen examen) {
		entityManager.persist(examen);
		return examen;
	}

	@Override
	public Examen editExamen(Integer id, Examen examen) {
		Examen exam = entityManager.find(Examen.class, id);
		if (exam == null) {
			System.out.println("000000000000");
			throw new RuntimeException("Examen introuvable");
		}
		
		System.out.println("1111111111111111");

		exam.setCode(examen.getCode());
		exam.setLibelle(examen.getLibelle());
		exam.setDate(examen.getDate());
		entityManager.persist(exam);
		return exam;
	}

	@Override
	public void deleteExamen(Integer id) {
		Examen exam = entityManager.find(Examen.class, id);
		if (exam == null) {
			throw new RuntimeException("Examen introuvable");
		}
		entityManager.remove(exam);
	}
	
	
	//etablissement

	@Override
	public List<Etablissement> getEtablissements() {
		Query query = entityManager.createQuery("select et from Etablissement et");
		return query.getResultList();
	}

	@Override
	public Etablissement getEtablissementsById(Integer id) {
		Etablissement etablissement = entityManager.find(Etablissement.class, id);
		if (etablissement == null) {
			throw new RuntimeException("Etablissement introuvable");
		}
		return etablissement;
	}

	@Override
	public Etablissement saveEtablissement(Etablissement etablissement) {
		entityManager.persist(etablissement);
		return etablissement;
	}

	@Override
	public Etablissement editEtablissement(Integer id, Etablissement etablissement) {
		Etablissement etabliss = entityManager.find(Etablissement.class, id);
		if (etabliss == null) {
			throw new RuntimeException("Etablissement introuvable");
		}
	
		etabliss.setCode(etablissement.getCode());
		etabliss.setNom(etablissement.getNom());
		etabliss.setAdresse(etablissement.getAdresse());
		etabliss.setVille(etablissement.getVille());
		entityManager.persist(etabliss);
		return etabliss;
	}

	@Override
	public void deleteEtablissement(Integer id) {
		Etablissement etablissement = entityManager.find(Etablissement.class, id);
		if (etablissement == null) {
			throw new RuntimeException("Etablissement introuvable");
		}
		entityManager.remove(etablissement);
		
	}

	
	//Inscription
	
	@Override
	public List<Inscription> getInscriptions() {
		Query query = entityManager.createQuery("select i from Inscription i");
		return query.getResultList();
	}

	@Override
	public Inscription getInscriptionsById(Integer id) {
		Inscription ins = entityManager.find(Inscription.class, id);
		if (ins == null) {
			throw new RuntimeException("Inscription introuvable");
		}
		return ins;
	}

	@Override
	public Inscription saveInscription(Inscription inscription) {
		entityManager.persist(inscription);
		return inscription;
	}

	@Override
	public Inscription editInscription(Integer id, Inscription inscription) {
		Inscription ins = entityManager.find(Inscription.class, id);
		if (ins == null) {
			throw new RuntimeException("Inscription introuvable");
		}
	
		ins.setNom(inscription.getNom());
		ins.setDateNaissance(inscription.getDateNaissance());
		ins.setEtablissement(inscription.getEtablissement());
		ins.setExamen(inscription.getExamen());
		entityManager.persist(ins);
		return ins;
	}

	@Override
	public void deleteInscription(Integer id) {
		Inscription inscription = entityManager.find(Inscription.class, id);
		if (inscription == null) {
			throw new RuntimeException("Inscription introuvable");
		}
		entityManager.remove(inscription);
		
	}
	
	

}

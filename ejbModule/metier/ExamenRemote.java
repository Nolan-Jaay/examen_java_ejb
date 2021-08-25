package metier;

import java.util.List;

import javax.ejb.Remote;

import metier.entities.Examen;

@Remote
public interface ExamenRemote {
	public List<Examen> getExamens();
	public Examen getExamensById(Integer id);
	public Examen saveExamen(Examen examen);
	public Examen editExamen(Integer id, Examen examen);
	public void deleteExamen(Integer id);

}

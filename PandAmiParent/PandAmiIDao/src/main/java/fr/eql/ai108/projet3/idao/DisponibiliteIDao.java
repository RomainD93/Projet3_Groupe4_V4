package fr.eql.ai108.projet3.idao;



import java.util.List;

import fr.eql.ai108.projet3.entity.Disponibilite;
import fr.eql.ai108.projet3.entity.Utilisateur;

public interface DisponibiliteIDao extends GenericIDao<Disponibilite> {
	List<Disponibilite> addList(List<Disponibilite> disponibilites);
	void deleteDisposByUser(Utilisateur utilisateur);
	List<Disponibilite> getDisposByUser(Utilisateur utilisateur);
}

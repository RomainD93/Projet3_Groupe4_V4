package fr.eql.ai108.projet3.idao;

import java.util.List;

import fr.eql.ai108.projet3.entity.Litige;
import fr.eql.ai108.projet3.entity.ReponseService;
import fr.eql.ai108.projet3.entity.TypeLitige;

public interface LitigeIDao extends GenericIDao<Litige> {
	List<Litige> getAll();
	List<Litige> getAllLitigesOuverts();
	List<Litige> getAllLitigesClotures();
	List<Litige> getAllLitiges1Retard();
	List<Litige> getAllLitiges2Financier();
	List<Litige> getAllLitiges3Casse();
	List<Litige> getAllLitiges4Violence();
	List<Litige> getAllLitiges5Comportement();
	ReponseService getLastReponseServiceByLitige(Litige litige);
	List<TypeLitige> getTypesLitiges();
	

}

package fr.eql.ai108.projet3.ibusiness;

import java.util.List;

import fr.eql.ai108.projet3.entity.Litige;
import fr.eql.ai108.projet3.entity.ReponseService;

public interface LitigeIBusiness {
	List<Litige> displayAllLitiges();
	List<Litige> displayLitigesOuverts();
	List<Litige> displayLitigesClotures();
	List<Litige> displayLitiges1Retard();
	List<Litige> displayLitiges2Financier();
	List<Litige> displayLitiges3Casse();
	List<Litige> displayLitiges4Violence();
	List<Litige> displayLitiges5Comportment();
	
	Litige creerLitige(Litige litige);
	Litige updateLitige(Litige litige);
	
	ReponseService displayReponseServiceDuLitige(Litige litige);
}

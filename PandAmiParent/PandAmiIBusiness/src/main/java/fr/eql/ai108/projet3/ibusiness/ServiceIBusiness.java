package fr.eql.ai108.projet3.ibusiness;

import java.util.List;

import fr.eql.ai108.projet3.entity.CategorieAide;
import fr.eql.ai108.projet3.entity.Materiel;
import fr.eql.ai108.projet3.entity.ReponseService;
import fr.eql.ai108.projet3.entity.Service;
import fr.eql.ai108.projet3.entity.TypeAide;

public interface ServiceIBusiness {
	List<Service> displayService();
	List<Service> displayServiceSsVolontaire();
	Long numServices();
	Service creerService(Service service);
	List<TypeAide> displayTypeAide();
	List<Materiel> displayMateriel();
	Service updateService(Service service);
	ReponseService creerReponseService(ReponseService reponseService);
	ReponseService updateReponseService(ReponseService reponseService);
	List<CategorieAide> displayCategorieAide();
	List<TypeAide> displayTypesAideCat1();
	List<TypeAide> displayTypesAideCat2();
}

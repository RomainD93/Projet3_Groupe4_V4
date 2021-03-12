package fr.eql.ai108.projet3.ibusiness;

import java.util.List;

import fr.eql.ai108.projet3.entity.CategorieAide;
import fr.eql.ai108.projet3.entity.Service;
import fr.eql.ai108.projet3.entity.TypeAide;

public interface ServiceIBusiness {
	List<Service> displayService();
	Long numServices();
	Service creerService(Service service);
	List<TypeAide> displayTypeAide();
}

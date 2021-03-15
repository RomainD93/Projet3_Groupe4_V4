package fr.eql.ai108.projet3.idao;

import java.util.List;

import fr.eql.ai108.projet3.entity.CategorieAide;
import fr.eql.ai108.projet3.entity.JourSemaine;
import fr.eql.ai108.projet3.entity.Materiel;
import fr.eql.ai108.projet3.entity.Service;
import fr.eql.ai108.projet3.entity.TypeAide;

public interface ServiceIDao extends GenericIDao<Service> {
	List<Service> getAll();
	List<Service> getAllNoVolontaire();
	Long getNbServices();
	List<TypeAide> typesAide();
	List<Materiel> materiels();

}

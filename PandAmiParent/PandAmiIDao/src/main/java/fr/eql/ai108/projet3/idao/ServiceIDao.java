package fr.eql.ai108.projet3.idao;

import java.util.List;

import fr.eql.ai108.projet3.entity.Service;

public interface ServiceIDao extends GenericIDao<Service> {
	List<Service> getAll();
	Long getNbServices();
}

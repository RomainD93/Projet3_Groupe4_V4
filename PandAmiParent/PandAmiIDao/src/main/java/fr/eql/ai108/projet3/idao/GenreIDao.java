package fr.eql.ai108.projet3.idao;

import java.util.List;

import fr.eql.ai108.projet3.entity.Genre;

public interface GenreIDao extends GenericIDao<Genre>{
	List<Genre> getAll();
}

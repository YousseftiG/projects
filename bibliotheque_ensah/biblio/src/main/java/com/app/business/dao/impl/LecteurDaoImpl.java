package com.app.business.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.business.bo.Lecteur;
import com.app.business.dao.LecteurDAO;
import com.genericdao.common.EntityNotFoundException;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;

@Repository
public class LecteurDaoImpl extends HibernateSpringGenericDaoImpl<Lecteur, Long> implements
		LecteurDAO {
	
	public LecteurDaoImpl() {

		super(Lecteur.class);

	}

	public List<Lecteur> getLecteurByName(String pName)
			{

		// soit avec : une requete HQL et la méthode find
		// List<Lecteur> list = (List<Lecteur>) getHibernateTemplate().find(
		// "from Lecteur where nom = ? ", pName);

		// ou
		  

		List<Lecteur> list = getEntityByColValue("Lecteur", "nom", pName);

		if (list == null || list.isEmpty()) {

			throw new EntityNotFoundException("Objet recherché introuvable");
		}

		return list;

	}

}

package com.app.business.dao;

import java.util.List;

import com.app.business.bo.Lecteur;
import com.genericdao.api.GenericDao;

public interface LecteurDAO extends GenericDao<Lecteur, Long> {
	
	public List<Lecteur> getLecteurByName(String pName)  ;
	
	
	
}

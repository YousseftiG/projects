package com.ensah.biblio.web.actions;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;
import com.app.business.bo.Lecteur;
import com.app.business.service.LecteurService;
@Namespace("/")
@ResultPath(value="/")
public class LecteurAction extends BaseAction{

	private static final long serialVersionUID = 1L;
	
	
	private Lecteur lecteur;
	@Autowired
	private LecteurService lecteurService;

	
//	@Action(value="add", results = { @Result( location ="pages/form.jsp", name = "success" ) })
//    public String test(){
//		
//			System.out.println("imrane");
//			return SUCCESS;
//		
//	
//}


	public String addLecteur() {

		// TODO: Traitement applicatif à faire

		lecteurService.addLecteur(lecteur);

		// TODO: Traitement applicatif à faire

		return SUCCESS;
	}

	public Lecteur getLecteur() {
		return lecteur;
	}

	public void setLecteur(Lecteur lecteur) {
		this.lecteur = lecteur;
	}

	public LecteurService getLecteurService() {
		return lecteurService;
	}

	public void setLecteurService(LecteurService lecteurService) {
		this.lecteurService = lecteurService;
	}

}

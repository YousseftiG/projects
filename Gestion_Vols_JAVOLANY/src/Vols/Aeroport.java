package Vols;

/***********************************************************************
 * Module:  Aeroport.java
 * Author:  ayoub
 * Purpose: Defines the Class Aeroport
 ***********************************************************************/
import Reservation.*;
import java.util.*;

/** @pdOid 432f65ea-6f0a-42e8-8c26-9943f45097bc */
public class Aeroport {
   /** @pdOid 5d57d905-7330-46f0-866a-bfb30750e3be */
   private String nomAeroport;
   /** @pdOid 039d3fd6-3d37-470d-b570-590926dbb3ea */
   private int idAeroport;
   
   /** @pdRoleInfo migr=no name=Ville assc=dessert mult=1..* side=A */
   private Ville[] ville;

    public Aeroport(String nomAeroport, int idAeroport) {
        this.nomAeroport = nomAeroport;
        this.idAeroport = idAeroport;
    }

    public Aeroport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Ville[] getVille() {
        return ville;
    }

    public void setVille(Ville[] ville) {
        this.ville = ville;
    }

    public String getNomAeroport() {
        return nomAeroport;
    }

    public void setNomAeroport(String nomAeroport) {
        this.nomAeroport = nomAeroport;
    }

    public int getIdAeroport() {
        return idAeroport;
    }

    public void setIdAeroport(int idAeroport) {
        this.idAeroport = idAeroport;
    }

    

}
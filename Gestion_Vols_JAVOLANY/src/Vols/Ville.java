package Vols;

/***********************************************************************
 * Module:  Ville.java
 * Author:  ayoub
 * Purpose: Defines the Class Ville
 ***********************************************************************/
import Reservation.*;
import java.util.*;

/** @pdOid 68e3c964-5560-49b4-a04e-56e0e7f9c89a */
public class Ville {
   /** @pdOid a9085323-3eb7-45ce-bca2-fcd89473592b */
   private int idVille;
   /** @pdOid 91f0154e-5011-41e3-8c56-65210e22a3ed */
   private java.lang.String nomVille;
   /** @pdOid 678dea70-7234-4cc4-81d6-a500ede1c4b7 */
   private String codePostale;
   
   /** @pdRoleInfo migr=no name=Aeroport assc=dessert coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<Aeroport> aeroport;

    public Ville(int idVille, String nomVille, String codePostale) {
        this.idVille = idVille;
        this.nomVille = nomVille;
        this.codePostale = codePostale;
    }

    public Ville() {
    }

   

    public int getIdVille() {
        return idVille;
    }

    public void setIdVille(int idVille) {
        this.idVille = idVille;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public String getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(String codePostale) {
        this.codePostale = codePostale;
    }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Aeroport> getAeroport() {
      if (aeroport == null)
         aeroport = new java.util.HashSet<Aeroport>();
      return aeroport;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorAeroport() {
      if (aeroport == null)
         aeroport = new java.util.HashSet<Aeroport>();
      return aeroport.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newAeroport */
   public void setAeroport(java.util.Collection<Aeroport> newAeroport) {
      removeAllAeroport();
      for (java.util.Iterator iter = newAeroport.iterator(); iter.hasNext();)
         addAeroport((Aeroport)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newAeroport */
   public void addAeroport(Aeroport newAeroport) {
      if (newAeroport == null)
         return;
      if (this.aeroport == null)
         this.aeroport = new java.util.HashSet<Aeroport>();
      if (!this.aeroport.contains(newAeroport))
         this.aeroport.add(newAeroport);
   }
   
   /** @pdGenerated default remove
     * @param oldAeroport */
   public void removeAeroport(Aeroport oldAeroport) {
      if (oldAeroport == null)
         return;
      if (this.aeroport != null)
         if (this.aeroport.contains(oldAeroport))
            this.aeroport.remove(oldAeroport);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllAeroport() {
      if (aeroport != null)
         aeroport.clear();
   }

}
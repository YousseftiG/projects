package Vols;

/***********************************************************************
 * Module:  CompagnieAierienne.java
 * Author:  ayoub
 * Purpose: Defines the Class CompagnieAierienne
 ***********************************************************************/
import Reservation.*;
import java.util.*;

/** @pdOid 82f8aae9-75ee-43f7-8ac3-21381adf76cf */
public class CompagnieAierienne {
   /** @pdOid 6572555a-11a6-439f-8a7c-98d8d1fc41d7 */
   private int idComp;
   /** @pdOid ffd884b0-e637-463b-abc1-85446f71db45 */
   private java.lang.String nomCompAirien;
   
   /** @pdRoleInfo migr=no name=Vol assc=proposevol coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   private java.util.Collection<Vol> proposevol;
   /** @pdRoleInfo migr=no name=Volcomplet assc=proposevolcomplet coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   private java.util.Collection<Volcomplet> volcomplet;
   /** @pdRoleInfo migr=no name=Client assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<Client> client;

    public CompagnieAierienne(int idComp, String nomCompAirien) {
        this.idComp = idComp;
        this.nomCompAirien = nomCompAirien;
    }

   

    public CompagnieAierienne() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdComp() {
        return idComp;
    }

    public void setIdComp(int idComp) {
        this.idComp = idComp;
    }

    public String getNomCompAirien() {
        return nomCompAirien;
    }

    public void setNomCompAirien(String nomCompAirien) {
        this.nomCompAirien = nomCompAirien;
    }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Vol> getProposevol() {
      if (proposevol == null)
         proposevol = new java.util.HashSet<Vol>();
      return proposevol;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProposevol() {
      if (proposevol == null)
         proposevol = new java.util.HashSet<Vol>();
      return proposevol.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newProposevol */
   public void setProposevol(java.util.Collection<Vol> newProposevol) {
      removeAllProposevol();
      for (java.util.Iterator iter = newProposevol.iterator(); iter.hasNext();)
         addProposevol((Vol)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newVol */
   public void addProposevol(Vol newVol) {
      if (newVol == null)
         return;
      if (this.proposevol == null)
         this.proposevol = new java.util.HashSet<Vol>();
      if (!this.proposevol.contains(newVol))
      {
         this.proposevol.add(newVol);
         newVol.setProposevol(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldVol */
   public void removeProposevol(Vol oldVol) {
      if (oldVol == null)
         return;
      if (this.proposevol != null)
         if (this.proposevol.contains(oldVol))
         {
            this.proposevol.remove(oldVol);
            oldVol.setProposevol((CompagnieAierienne)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProposevol() {
      if (proposevol != null)
      {
         Vol oldVol;
         for (java.util.Iterator iter = getIteratorProposevol(); iter.hasNext();)
         {
            oldVol = (Vol)iter.next();
            iter.remove();
            oldVol.setProposevol((CompagnieAierienne)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Volcomplet> getVolcomplet() {
      if (volcomplet == null)
         volcomplet = new java.util.HashSet<Volcomplet>();
      return volcomplet;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorVolcomplet() {
      if (volcomplet == null)
         volcomplet = new java.util.HashSet<Volcomplet>();
      return volcomplet.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newVolcomplet */
   public void setVolcomplet(java.util.Collection<Volcomplet> newVolcomplet) {
      removeAllVolcomplet();
      for (java.util.Iterator iter = newVolcomplet.iterator(); iter.hasNext();)
         addVolcomplet((Volcomplet)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newVolcomplet */
   public void addVolcomplet(Volcomplet newVolcomplet) {
      if (newVolcomplet == null)
         return;
      if (this.volcomplet == null)
         this.volcomplet = new java.util.HashSet<Volcomplet>();
      if (!this.volcomplet.contains(newVolcomplet))
         this.volcomplet.add(newVolcomplet);
   }
   
   /** @pdGenerated default remove
     * @param oldVolcomplet */
   public void removeVolcomplet(Volcomplet oldVolcomplet) {
      if (oldVolcomplet == null)
         return;
      if (this.volcomplet != null)
         if (this.volcomplet.contains(oldVolcomplet))
            this.volcomplet.remove(oldVolcomplet);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllVolcomplet() {
      if (volcomplet != null)
         volcomplet.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Client> getClient() {
      if (client == null)
         client = new java.util.HashSet<Client>();
      return client;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorClient() {
      if (client == null)
         client = new java.util.HashSet<Client>();
      return client.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newClient */
   public void setClient(java.util.Collection<Client> newClient) {
      removeAllClient();
      for (java.util.Iterator iter = newClient.iterator(); iter.hasNext();)
         addClient((Client)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newClient */
   public void addClient(Client newClient) {
      if (newClient == null)
         return;
      if (this.client == null)
         this.client = new java.util.HashSet<Client>();
      if (!this.client.contains(newClient))
      {
         this.client.add(newClient);
         newClient.setCompagnieAierienne(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldClient */
   public void removeClient(Client oldClient) {
      if (oldClient == null)
         return;
      if (this.client != null)
         if (this.client.contains(oldClient))
         {
            this.client.remove(oldClient);
            oldClient.setCompagnieAierienne((CompagnieAierienne)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllClient() {
      if (client != null)
      {
         Client oldClient;
         for (java.util.Iterator iter = getIteratorClient(); iter.hasNext();)
         {
            oldClient = (Client)iter.next();
            iter.remove();
            oldClient.setCompagnieAierienne((CompagnieAierienne)null);
         }
      }
   }

}
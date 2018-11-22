package Reservation;

/***********************************************************************
 * Module:  Client.java
 * Author:  ayoub
 * Purpose: Defines the Class Client
 ***********************************************************************/
import Vols.*;
import java.util.*;

/** @pdOid 1aae72bf-7185-4d53-9322-5d4faac7bb7d */
public class Client {
   /** @pdOid 5fd1e83c-a5aa-4642-954a-b4ffbc227123 */
   private java.lang.String cin;
   /** @pdOid efdf5fab-1675-43ed-99eb-b66021b66352 */
   private java.lang.String prenomClient;
   /** @pdOid dd1e623b-7cba-4540-af8d-7c0e5d53726d */
   private java.lang.String adresseClient;
   /** @pdOid dacd47f1-dc2e-4992-9c1c-2f16369b0566 */
   private long telClient;
   /** @pdOid 629a0abc-41fd-41d5-a9e1-28f57e9af9b5 */
   private long numFaxClient;

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getAdresseClient() {
        return adresseClient;
    }

    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }

    public long getTelClient() {
        return telClient;
    }

    public void setTelClient(long telClient) {
        this.telClient = telClient;
    }

    public long getNumFaxClient() {
        return numFaxClient;
    }

    public void setNumFaxClient(long numFaxClient) {
        this.numFaxClient = numFaxClient;
    }
   
   /** le client effectue 0 ou plusieur reservation
    * une reservation concerne unet un seul client
    * constraint frozen */
   /** @pdRoleInfo migr=no name=Reservation assc=effectuer coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Reservation> reservation;
   /** @pdRoleInfo migr=no name=CompagnieAierienne assc=association2 mult=0..1 side=A */
   public CompagnieAierienne compagnieAierienne;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Reservation> getReservation() {
      if (reservation == null)
         reservation = new java.util.HashSet<Reservation>();
      return reservation;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorReservation() {
      if (reservation == null)
         reservation = new java.util.HashSet<Reservation>();
      return reservation.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newReservation */
   public void setReservation(java.util.Collection<Reservation> newReservation) {
      removeAllReservation();
      for (java.util.Iterator iter = newReservation.iterator(); iter.hasNext();)
         addReservation((Reservation)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newReservation */
   public void addReservation(Reservation newReservation) {
      if (newReservation == null)
         return;
      if (this.reservation == null)
         this.reservation = new java.util.HashSet<Reservation>();
      if (!this.reservation.contains(newReservation))
      {
         this.reservation.add(newReservation);
         newReservation.setClient(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldReservation */
   public void removeReservation(Reservation oldReservation) {
      if (oldReservation == null)
         return;
      if (this.reservation != null)
         if (this.reservation.contains(oldReservation))
         {
            this.reservation.remove(oldReservation);
            oldReservation.setClient((Client)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllReservation() {
      if (reservation != null)
      {
         Reservation oldReservation;
         for (java.util.Iterator iter = getIteratorReservation(); iter.hasNext();)
         {
            oldReservation = (Reservation)iter.next();
            iter.remove();
            oldReservation.setClient((Client)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public CompagnieAierienne getCompagnieAierienne() {
      return compagnieAierienne;
   }
   
   /** @pdGenerated default parent setter
     * @param newCompagnieAierienne */
   public void setCompagnieAierienne(CompagnieAierienne newCompagnieAierienne) {
      if (this.compagnieAierienne == null || !this.compagnieAierienne.equals(newCompagnieAierienne))
      {
         if (this.compagnieAierienne != null)
         {
            CompagnieAierienne oldCompagnieAierienne = this.compagnieAierienne;
            this.compagnieAierienne = null;
            oldCompagnieAierienne.removeClient(this);
         }
         if (newCompagnieAierienne != null)
         {
            this.compagnieAierienne = newCompagnieAierienne;
            this.compagnieAierienne.addClient(this);
         }
      }
   }

}
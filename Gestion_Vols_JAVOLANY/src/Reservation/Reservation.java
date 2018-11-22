package Reservation;

/***********************************************************************
 * Module:  Reservation.java
 * Author:  ayoub
 * Purpose: Defines the Class Reservation
 ***********************************************************************/
import Vols.*;
import java.util.*;

/** @pdOid 812d3e11-8616-46b8-94ac-b2a7cee88350 */
public class Reservation {
   /** @pdOid 0cdd5438-67ae-4d4d-b491-350bba5073dc */
   private int numeroReservation;
   /** @pdOid 370f4b06-10b5-4093-a6b9-84f2bad8e206 */
   private java.util.Date dateReservation;

    public Passager getPassager() {
        return passager;
    }

    public void setPassager(Passager passager) {
        this.passager = passager;
    }
   
   /** @pdRoleInfo migr=no name=Passager assc=concerne mult=1..1 */
   private Passager passager;
   /** le client effectue 0 ou plusieur reservation
    * une reservation concerne unet un seul client
    * constraint frozen */
   /** @pdRoleInfo migr=no name=Client assc=effectuer mult=1..1 side=A */
   private Client client;
   /** @pdRoleInfo migr=no name=Volcomplet assc=reservationVol mult=1..1 side=A */
   private Volcomplet volcomplet;

    public int getNumeroReservation() {
        return numeroReservation;
    }

    public void setNumeroReservation(int numeroReservation) {
        this.numeroReservation = numeroReservation;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }
   
   
   /** @pdGenerated default parent getter */
   public Client getClient() {
      return client;
   }
   
   /** @pdGenerated default parent setter
     * @param newClient */
   public void setClient(Client newClient) {
      if (this.client == null || !this.client.equals(newClient))
      {
         if (this.client != null)
         {
            Client oldClient = this.client;
            this.client = null;
            oldClient.removeReservation(this);
         }
         if (newClient != null)
         {
            this.client = newClient;
            this.client.addReservation(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Volcomplet getVolcomplet() {
      return volcomplet;
   }
   
   /** @pdGenerated default parent setter
     * @param newVolcomplet */
   public void setVolcomplet(Volcomplet newVolcomplet) {
      if (this.volcomplet == null || !this.volcomplet.equals(newVolcomplet))
      {
         if (this.volcomplet != null)
         {
            Volcomplet oldVolcomplet = this.volcomplet;
            this.volcomplet = null;
            oldVolcomplet.removeReservation(this);
         }
         if (newVolcomplet != null)
         {
            this.volcomplet = newVolcomplet;
            this.volcomplet.addReservation(this);
         }
      }
   }

}
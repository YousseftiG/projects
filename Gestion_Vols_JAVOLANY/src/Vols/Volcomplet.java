package Vols;

/***********************************************************************
 * Module:  Volcomplet.java
 * Author:  ayoub
 * Purpose: Defines the Class Volcomplet
 ***********************************************************************/
import Reservation.*;
import java.util.*;

/** @pdOid 662f404d-9eeb-4620-9706-3fc44e8bd1ef */
public class Volcomplet {
   /** @pdOid e170441d-1789-47b0-b2e8-2452bf5880ac */
   private int numeroVol;
   /** @pdOid 215a0191-dd49-4dad-b527-957be1e3fb4b */
   private int nbVol;
   
   /** @pdRoleInfo migr=no name=Reservation assc=reservationVol coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<Reservation> reservation;
   /** @pdRoleInfo migr=no name=Vol assc=association14 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Composition */
   private java.util.Collection<Vol> vol;
   /** @pdRoleInfo migr=no name=CompagnieAierienne assc=proposevolcomplet mult=1..* side=A */
   private CompagnieAierienne[] compagnieAierienne;

    public Volcomplet(int numeroVol, int nbVol) {
        this.numeroVol = numeroVol;
        this.nbVol = nbVol;
    }

    

    public Volcomplet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumeroVol() {
        return numeroVol;
    }

    public void setNumeroVol(int numeroVol) {
        this.numeroVol = numeroVol;
    }

    public int getNbVol() {
        return nbVol;
    }

    public void setNbVol(int nbVol) {
        this.nbVol = nbVol;
    }

    public CompagnieAierienne[] getCompagnieAierienne() {
        return compagnieAierienne;
    }

    public void setCompagnieAierienne(CompagnieAierienne[] compagnieAierienne) {
        this.compagnieAierienne = compagnieAierienne;
    }
   
   
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
         newReservation.setVolcomplet(this);      
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
            oldReservation.setVolcomplet((Volcomplet)null);
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
            oldReservation.setVolcomplet((Volcomplet)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Vol> getVol() {
      if (vol == null)
         vol = new java.util.HashSet<Vol>();
      return vol;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorVol() {
      if (vol == null)
         vol = new java.util.HashSet<Vol>();
      return vol.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newVol */
   public void setVol(java.util.Collection<Vol> newVol) {
      removeAllVol();
      for (java.util.Iterator iter = newVol.iterator(); iter.hasNext();)
         addVol((Vol)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newVol */
   public void addVol(Vol newVol) {
      if (newVol == null)
         return;
      if (this.vol == null)
         this.vol = new java.util.HashSet<Vol>();
      if (!this.vol.contains(newVol))
         this.vol.add(newVol);
   }
   
   /** @pdGenerated default remove
     * @param oldVol */
   public void removeVol(Vol oldVol) {
      if (oldVol == null)
         return;
      if (this.vol != null)
         if (this.vol.contains(oldVol))
            this.vol.remove(oldVol);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllVol() {
      if (vol != null)
         vol.clear();
   }

}
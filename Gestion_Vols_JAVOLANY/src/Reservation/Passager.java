package Reservation;

/***********************************************************************
 * Module:  Passager.java
 * Author:  ayoub
 * Purpose: Defines the Class Passager
 ***********************************************************************/
import Vols.*;
import java.util.*;

/** @pdOid ad1d118c-de16-4f07-9f3d-a9de5633628b */
public class Passager {

    public int getIdPassager() {
        return idPassager;
    }

    public void setIdPassager(int idPassager) {
        this.idPassager = idPassager;
    }
   private int idPassager;
   /** @pdOid c7643d31-b991-4318-b9a7-229704a15906 */
   private java.lang.String nomPassager;
   /** @pdOid af2cbc55-507b-4da9-a54d-74d4b0f60c2a */
   private java.lang.String prenomPassager;
   
   /** @pdRoleInfo migr=no name=Reservation assc=concerne mult=0..* side=A */
   private Reservation[] reservation;

    public String getNomPassager() {
        return nomPassager;
    }

    public void setNomPassager(String nomPassager) {
        this.nomPassager = nomPassager;
    }

    public String getPrenomPassager() {
        return prenomPassager;
    }

    public void setPrenomPassager(String prenomPassager) {
        this.prenomPassager = prenomPassager;
    }

    public Reservation[] getReservation() {
        return reservation;
    }

    public void setReservation(Reservation[] reservation) {
        this.reservation = reservation;
    }

}
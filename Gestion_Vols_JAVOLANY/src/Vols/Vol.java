package Vols;

/***********************************************************************
 * Module:  Vol.java
 * Author:  ayoub
 * Purpose: Defines the Class Vol
 ***********************************************************************/
import Reservation.*;
import java.util.*;

/** @pdOid ac8a8933-67a7-4395-9ab7-fc30c0de7812 */
public class Vol {
   /** @pdOid 4cc2c019-0dca-45f3-b0c5-e9551c35bc6b */
   private java.util.Date datedepart;
   /** @pdOid 8089f2af-780a-453b-81e6-1e7aea4307c5 */
   private java.util.Date datearive;
   /** @pdOid 5b11c2c9-deba-4b49-aef2-5ed2fbaff751 */
   private int idVol;

    public Date getDatedepart() {
        return datedepart;
    }

    public void setDatedepart(Date datedepart) {
        this.datedepart = datedepart;
    }

    public Date getDatearive() {
        return datearive;
    }

    public void setDatearive(Date datearive) {
        this.datearive = datearive;
    }

    public int getIdVol() {
        return idVol;
    }

    public void setIdVol(int idVol) {
        this.idVol = idVol;
    }
   
   /** @pdRoleInfo migr=no name=CompagnieAierienne assc=proposevol mult=1..1 side=A */
   private CompagnieAierienne proposevol;
   
   
   /** @pdGenerated default parent getter */
   public CompagnieAierienne getProposevol() {
      return proposevol;
   }
   
   /** @pdGenerated default parent setter
     * @param newCompagnieAierienne */
   public void setProposevol(CompagnieAierienne newCompagnieAierienne) {
      if (this.proposevol == null || !this.proposevol.equals(newCompagnieAierienne))
      {
         if (this.proposevol != null)
         {
            CompagnieAierienne oldCompagnieAierienne = this.proposevol;
            this.proposevol = null;
            oldCompagnieAierienne.removeProposevol(this);
         }
         if (newCompagnieAierienne != null)
         {
            this.proposevol = newCompagnieAierienne;
            this.proposevol.addProposevol(this);
         }
      }
   }

}
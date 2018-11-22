/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Vols.CompagnieAierienne;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ayoub
 */
public class CompArn extends  DAO<CompagnieAierienne> {

    public CompArn(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(CompagnieAierienne CmpAr) {
         try {
      ResultSet result = this.connect.createStatement().executeQuery("INSERT INTO compagnieaierienne VALUES ("+CmpAr.getIdComp()+","+CmpAr.getNomCompAirien()+")" );
      if(result.rowInserted())
          return true;
      else 
          return false;
    } catch (SQLException e) {
      e.printStackTrace();
    }
     return false;

    }

    @Override
    public boolean delete(CompagnieAierienne CmpAr) {
        try {
      ResultSet result = this.connect.createStatement().executeQuery("DELETE FROM compagnieaierienne WHERE idAeroport ="+CmpAr.getIdComp() );
      if(result.rowDeleted())
                 return true;
      else 
          return false;
    } catch (SQLException e) {
      e.printStackTrace();
    }
     return false;
    }

    @Override
    public boolean update(CompagnieAierienne CmpAr) {
        try {
      ResultSet result = this.connect.createStatement().executeQuery("UPDATE compagnieaierienne set nomAeroport="+CmpAr.getNomCompAirien()+" WHERE idAeroport ="+CmpAr.getIdComp() );
      if(result.rowUpdated())
                 return true;
      else 
          return false;
    } catch (SQLException e) {
      e.printStackTrace();
    }
     return false;
    }
    @Override
    public CompagnieAierienne find(int id) {
        CompagnieAierienne cmpAr = new CompagnieAierienne();
        try {
      ResultSet result = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM aeroport WHERE idAeroport = " + id);
      if(result.first())
        cmpAr = new CompagnieAierienne(id,result.getString("nomCompAirien"));         
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return cmpAr;
    }
    
}

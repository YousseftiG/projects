/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Vols.Volcomplet;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ayoub
 */
public class VolCompletDAO extends  DAO<Volcomplet> {
    public VolCompletDAO(Connection conn)
    {
        super(conn);
        
        
    }

    
    public boolean create(Volcomplet Volcomplet) {
        try {
      ResultSet result = this.connect.createStatement().executeQuery("INSERT INTO Volcomplet VALUES ("+Volcomplet.getNumeroVol()+","+Volcomplet.getNbVol()+")" );
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
    public boolean delete(Volcomplet Volcomplet) {
        try {
      ResultSet result = this.connect.createStatement().executeQuery("DELETE FROM Volcomplet WHERE idVolcomplet ="+Volcomplet.getNumeroVol());
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
    public boolean update(Volcomplet Volcomplet) {
        try {
      ResultSet result = this.connect.createStatement().executeQuery("UPDATE Volcomplet set nbVol="+Volcomplet.getNbVol());
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
    public Volcomplet find(int id) {
        Volcomplet Volcomplet = new Volcomplet();      
      
    try {
      ResultSet result = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Volcomplet WHERE idVolcomplet = " + id);
      if(result.first())
        Volcomplet = new Volcomplet(id,result.getInt("nbVol"));         
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return Volcomplet;
  }

    
    
    
}

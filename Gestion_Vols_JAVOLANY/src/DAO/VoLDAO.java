/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Vols.Vol;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Clock;

/**
 *
 * @author ayoub
 */
public class VoLDAO extends DAO<Vol>{

    public VoLDAO(Connection conn) {
        super(conn);
    }

    
    public boolean create(Vol Vol) {
        try {
      ResultSet result = this.connect.createStatement().executeQuery("INSERT INTO Vol VALUES ("+null+","+Vol.getIdVol()+Vol.getDatedepart()+","+Vol.getDatedepart()+")" );
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
    public boolean delete(Vol obj) {
        
        return false;
       
    }

    @Override
    public boolean update(Vol obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vol find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

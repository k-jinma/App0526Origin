package com.mycompany.app0526origin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PacienteDAO {
   
    private Connection connection;

    public PacienteDAO(Connection connection) {
        this.connection = connection;
    }
    
    public ResultSet getPacienteAll(){
        ResultSet rs = null;
        String sql = "SELECT * FROM PACIENTE";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return rs;
       
    }
   
    
}

package com.mycompany.app0526origin;

import com.mycompany.app0526origin.dao.PacienteDAO;
import com.mycompany.app0526origin.database.DatabaseConnectionManager;
import com.mycompany.app0526origin.model.Paciente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppMain {

    public static void main(String[] args) {
        //DBに接続する
        Connection connection = DatabaseConnectionManager.getConnection();
        
        PacienteDAO pacienteDAO = new PacienteDAO(connection);
        ResultSet rs = pacienteDAO.getPacienteAll();
        try {
            List<Paciente> pList = new ArrayList<>();
            while( rs.next() ){
                Paciente p = new Paciente();
                p.setDni( rs.getString("dni") );
                p.setNombre( rs.getString("nombre") );
                p.setTelefono(rs.getString("telefono") );
                
                pList.add(p);
            }
            
            for( Paciente p : pList ){
                System.out.print( p.getDni() );
                System.out.print( p.getNombre() );
                System.out.println( p.getTelefono() );
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AppMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

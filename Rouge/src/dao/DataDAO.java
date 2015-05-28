/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import ds.PMF;
import model.Data;

/**
 *
 * @author 
 */
public class DataDAO {
    private final String DRIVER_NAME = "org.apache.derby.jdbc.ClientDriver";
    private final String JDBC_URL = "jdbc:derby://localhost:1527/db2932";
    private final String DB_USER="db2932";
    private final String DB_PASS ="db2932";
    
    public List<Data> findAll(){
        Connection conn = null;
        List<Data> dataList = new ArrayList<Data>();
        try {
            Class.forName(DRIVER_NAME);
            conn = DriverManager.getConnection(
                    JDBC_URL,DB_USER,DB_PASS);
             String sq1 = 
                     "SELECT NAME,PASS FROM DATA ORDER BY ID DESC";
             PreparedStatement pStmt = conn.prepareStatement(sq1);
             
             ResultSet rs = pStmt.executeQuery();
             while(rs.next()){
                 String userName = rs.getString("NAME");
                 String pass = rs.getString("PASS");
                 Data data = new Data(userName,pass);
                 dataList.add(data);
             }
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            return null;
        }finally{
            if(conn != null){
                try{
                    conn.close();
                }catch(SQLException e){
                    e.printStackTrace();
                    return null;
                }
            }
        }
        return dataList;
    }
    
    public void create(Data data){

        PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        try {
            manager.makePersistent(data);
        } finally {
            manager.close();
        }
    }
}
package dao;



import javax.jdo.*;

import javax.jdo.PersistenceManagerFactory;

import ds.PMF;
import model.Data;
import model.Login;

/**
 *
 * @author 
 */
public class AccountDAO {
    public Data findByLogin(Login login) {
    	 PersistenceManagerFactory factory = PMF.get();
         PersistenceManager manager = factory.getPersistenceManager();
         Data data;
         try {
        	 data = (Data) manager.getObjectById(Data.class, login.getName());
         } catch(JDOObjectNotFoundException e){
             data = null;	 
         }
         manager.close();
         return data;
    }
}
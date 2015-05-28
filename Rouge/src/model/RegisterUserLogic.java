/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.DataDAO;

/**
 *
 * @author 
 */
public class RegisterUserLogic {
    public void register(Data data){
       DataDAO dao = new DataDAO();
        dao.create(data);
    }
}

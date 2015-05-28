/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.AccountDAO;

/**
 *
 * @author 
 */
public class LoginLogic {
        public boolean execute(Login login){
        AccountDAO dao = new AccountDAO();
        Data data = dao.findByLogin(login);
        return data != null;
    }
}

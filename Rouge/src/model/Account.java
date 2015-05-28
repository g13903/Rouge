/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import javax.jdo.annotations.*;
/**
 *
 * @author 
 */
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Account{
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private String name;
     
    @Persistent
    private String pass;
     
    public Account(String name,String pass) {
        this.name = name;
        this.pass = pass;
    }
     public String getName() { return name;}
     public String getPass() { return pass;}
}

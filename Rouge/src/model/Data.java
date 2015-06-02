/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

import javax.jdo.annotations.*;


/**
 *
 * @author 
 */

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Data implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private String userName;
	
	@Persistent
	private String pass;

    public Data(){}
    public Data(String userName,String pass){
    	super();
        this.userName = userName;
        this.pass = pass;
    }
    public String getUserName() { return userName; }
    public String getPass() {return pass; }
}

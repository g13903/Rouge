package model;

import java.io.Serializable;
import javax.jdo.annotations.*;

	/**
	 *
	 * @author 
	 */
	@PersistenceCapable(identityType = IdentityType.APPLICATION)
	public class Order implements Serializable{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@PrimaryKey
		@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
		private Long date;
		
		@Persistent
		private String userName;
		
		@Persistent
		private int rouge;

		@Persistent
		private int num;
		
		
		
	    public Order(){}
	    public Order(Long date,String userName,int rouge,int num){
	    	super();
	    	this.date = date;
	        this.userName = userName;
	        this.rouge = rouge;
	        this.num = num;
	    }
	    public Long getDate(){return date;}
	    public String getUserName() { return userName; }
	    public int getRougeIndex() { return rouge;}
	    public String getRouge() { 
	    	String[] rougeA = {"CANMAKE","MAYBELLINE","ANNASUI","MAC","CHANEL","KiSHiORiGiNAL"};
	    	return rougeA[rouge-1]; }
	    public int getNum() { return num;}
	}

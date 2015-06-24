/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author 
 */
public class Price implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private int sumRouge;
    private int sumPrice;
    private int[] mulPrice = new int[6];
    private int[] rougeNum = new int[6];
    private int[] price={550,1200,2800,3300,4500,12000};
    
    public Price() { }
    public Price(String rouge1,String rouge2,String rouge3,String rouge4,String rouge5,String rouge6) {
        rougeNum[0] = Integer.parseInt(rouge1);
        rougeNum[1] = Integer.parseInt(rouge2);
        rougeNum[2] = Integer.parseInt(rouge3);
        rougeNum[3] = Integer.parseInt(rouge4);
        rougeNum[4] = Integer.parseInt(rouge5);
        rougeNum[5] = Integer.parseInt(rouge6);
        for(int i = 0;i<rougeNum.length;i++){
        	mulPrice[i]=price[i]*rougeNum[i];
        	sumPrice+=mulPrice[i];
        	sumRouge+=rougeNum[i];
        }
       
       // this.sumRouge = r1+r2+r3+r4+r5+r6;//rougeの合計注文数
       
        
    }
    public int getRouge(int index) {return rougeNum[index-1]; }
    public int getRougeMulPrice(int index) { return mulPrice[index-1];}
    public int getRougePrice(int index) { return price[index-1];}
    public int getSumRouge() {return sumRouge;}
    public int getSumPrice() {return sumPrice;}
    public int getRougeNum() {return 6;}
}

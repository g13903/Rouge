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
	
	private int r1;
    private int r2;
    private int r3;
    private int r4;
    private int r5;
    private int r6;
    private int sumRouge;
    private int price1;
    private int price2;
    private int price3;
    private int price4;
    private int price5;
    private int price6;
    private int sumPrice;
    private int[] rougeNum;
    
    public Price() { }
    public Price(String rouge1,String rouge2,String rouge3,String rouge4,String rouge5,String rouge6) {
        this.r1 = Integer.parseInt(rouge1);
        this.price1 = 550*r1;
        
        this.r2 = Integer.parseInt(rouge2);
        this.price2 = 1200*r2;
        
        this.r3 = Integer.parseInt(rouge3);
        this.price3 = 2500*r3;
        
        this.r4 = Integer.parseInt(rouge4);
        this.price4 = 3300*r4;
        
        this.r5 = Integer.parseInt(rouge5);
        this.price5 = 4500*r5;
        
        this.r6 = Integer.parseInt(rouge6);
        this.price6 = 12000*r6;
        
        this.sumRouge = r1+r2+r3+r4+r5+r6;//rougeの合計注文数
        this.sumPrice = price1+price2+price3+price4+price5+price6;//合計のお値段
       
        rougeNum=new int[]{r1,r2,r3,r4,r5,r6};
        
        
    }
    public int getRouge(int index) {return rougeNum[index-1]; }
    public int getRouge1(){return r1;}
    public int getPrice1() {return price1;}
    public int getRouge2() {return r2; }
    public int getPrice2() {return price2;}
    public int getRouge3() {return r3; }
    public int getPrice3() {return price3;}
    public int getRouge4() {return r4; }
    public int getPrice4() {return price4;}
    public int getRouge5() {return r5; }
    public int getPrice5() {return price5;}
    public int getRouge6() {return r6; }
    public int getPrice6() {return price6;}
    public int getSumRouge() {return sumRouge;}
    public int getSumPrice() {return sumPrice;}
    public int getRougeNum() {return 6;}
}

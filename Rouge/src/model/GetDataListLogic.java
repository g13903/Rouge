/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import dao.DataDAO;
/**
 *
 * @author 
 */
public class GetDataListLogic {
    
    public List<Data> execute(){
    DataDAO dao = new DataDAO();
    List<Data> dataList = dao.findAll();
    return dataList;
  }
}

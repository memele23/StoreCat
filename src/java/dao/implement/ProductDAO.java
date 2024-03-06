/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.implement;

import dao.CommonUse;
import entity.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class ProductDAO extends CommonUse<Product>{

    @Override
    public List<Product> findAll() {
         return queryGenericDAO(Product.class);
    }

    @Override
    public int insert(Product t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main(String[] args) {
        ProductDAO daoPro = new ProductDAO();
               
        List<Product> listPro = daoPro.findAll();
        for (Product product : listPro) {
            System.out.println(product);
        }
    }
    
}

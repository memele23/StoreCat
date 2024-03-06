/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.implement;

import dao.CommonUse;
import entity.Category;
import java.util.List;

/**
 *
 * @author PC
 */
public class CategoryDAO extends CommonUse<Category>{

    @Override
    public List<Category> findAll() {
        return queryGenericDAO(Category.class);
    }

    @Override
    public int insert(Category t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static void main(String[] args) {
        CategoryDAO daoCate = new CategoryDAO();
        List<Category> list = daoCate.findAll();
        for (Category category : list) {
            System.out.println(category);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ROHIT
 */
public class driverDAO {
     public boolean update(driver d)
    {
        
        boolean flag=false;
        try
        {
                        Class.forName("com.mysql.cj.jdbc.Driver");
 
            String url="jdbc:mysql://localhost:3306/busman";
            String name="root";
            String pwd = "";
            Connection con =DriverManager.getConnection(url,name,pwd);
            Statement stmt = con.createStatement();
           stmt.executeUpdate("insert into driver1(DID, DName, DSalary, Dage,DLN) values ('" + d.getId() + "','" + d.getName() + "','" + d.getSalary() + "','" + d.getAge() + "','" + d.getLn() + "')"); 
            
             flag = true;
         
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
}
 
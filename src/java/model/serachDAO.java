/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ROHIT
 */
public class serachDAO {
        public boolean search1(search u)
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
             String qr = "select *from driver1 where DID='"+u.getId()+"' and DName='"
                     + u.getName()+"'";
             ResultSet rs = stmt.executeQuery(qr);
             flag = rs.next();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
}

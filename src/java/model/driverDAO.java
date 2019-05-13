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
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author ROHIT
 */
public class driverDAO {
//     public boolean update(driver d)
//    {
//        
//        boolean flag=false;
//        try
//        {
//                        Class.forName("com.mysql.cj.jdbc.Driver");
// 
//            String url="jdbc:mysql://localhost:3306/busman";
//            String name="root";
//            String pwd = "";
//            Connection con =DriverManager.getConnection(url,name,pwd);
//            Statement stmt = con.createStatement();
//           stmt.executeUpdate("insert into driver1(DID, DName, DSalary, Dage,DLN) values ('" + d.getId() + "','" + d.getName() + "','" + d.getSalary() + "','" + d.getAge() + "','" + d.getLn() + "')"); 
//            
//             flag = true;
//         
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//        return flag;
//    }
    public boolean update(driver d)
    {
        boolean flag=false;
        try {
       Configuration cf = new Configuration();
        cf.configure();
        SessionFactory sf = cf.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(d);
        flag=true;
         tx.commit();
        session.close();
        sf.close();
        }
        catch(Exception e)
        {
         e.printStackTrace();   
        }
        
        return flag;
    }
    
}
 
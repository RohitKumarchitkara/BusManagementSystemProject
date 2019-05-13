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
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author ROHIT
 */
public class facultyDAO {
      public boolean check(faculty u)
    {
         boolean flag=false;
        try 
        {
            Configuration cf=new Configuration();
            cf.configure("cfgpackage2/hibernate2.cfg.xml");
            SessionFactory sf = cf.buildSessionFactory();
            Session session1 =sf.openSession();
            session1 =sf.openSession();
            Transaction tx = session1.beginTransaction();
            String sql = "from faculty1 where email='"+u.getEmail()+"' and password='"
                     +u.getPass()+"'";
//             String sql =   "from sign where name='"+u.getName()+"' and password='"+ u.getPass()+"'";
            Query query = session1.createQuery(sql);
           //int i= query.executeUpdate();
//           query.setParameter(u.getName(), ());
           ArrayList<faculty1> s1 = (ArrayList<faculty1>)query.list();
            tx.commit();
           if(s1!=null)
           {
               flag=true;
           }
        session1.close();
        sf.close();
        
        }
        catch(Exception e)
        {
             e.printStackTrace();
        }
      
        return flag;
    }
    
}

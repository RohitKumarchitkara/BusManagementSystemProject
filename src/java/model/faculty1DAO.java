
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class faculty1DAO {
     public boolean create2(faculty1 s)
    {
        boolean flag=false;
        try {
       Configuration cf = new Configuration();
        cf.configure("cfgpackage2/hibernate2.cfg.xml");
        SessionFactory sf = cf.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(s);
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

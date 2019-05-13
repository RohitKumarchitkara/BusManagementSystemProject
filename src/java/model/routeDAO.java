
package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class routeDAO {
      public boolean add(route r)
    {
         boolean flag=false;
        try {
       Configuration cf = new Configuration();
        cf.configure();
        SessionFactory sf = cf.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(r);
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

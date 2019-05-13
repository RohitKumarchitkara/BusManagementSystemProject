
package model;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class signDAO {
     public boolean create1(Sign1 s)
    {
        boolean flag=false;
        try {
       Configuration cf = new Configuration();
        cf.configure("cfgpackage/hibernate1.cfg.xml");
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
     public ArrayList<Sign1> getAllpermission()
     {
         ArrayList<Sign1> result = null;
         Configuration cf = null;
         SessionFactory sf = null;
         Session session = null;
         try 
         {
             cf=new Configuration();
             cf.configure("cfgpackage/hibernate1.cfg.xml");
             sf=cf.buildSessionFactory();
             session=sf.openSession();
             Transaction tx = session.beginTransaction();
             String hql = "From Sign1 s where s.permission=:permit";
             Query q = session.createQuery(hql);
             String s1 = null;
             q.setParameter("permit", s1);
             result = (ArrayList<Sign1>) q.list();
             tx.commit();
             
         }
         catch(Exception e) 
                 {
                     System.out.println("Error"+e);
                     e.printStackTrace();
                 }
         finally 
         {
             session.close();
         }
         return result;
     }
     
     public List<Sign1> getProfile(String rno){
         
         System.out.println("In dao"+rno);
         
         ArrayList<Sign1> records=null;
         try {
       Configuration cf = new Configuration();
        cf.configure("cfgpackage/hibernate1.cfg.xml");
        SessionFactory sf = cf.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("From Sign1 where name = '"+rno+"' ");
       
        records = (ArrayList<Sign1>)query.list();
        
        tx.commit();
        session.close();
        sf.close();
            }
            catch(Exception e)
            {
                 e.printStackTrace(); 
            }
         return records;
     }
     
}

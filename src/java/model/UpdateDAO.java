
package model;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateDAO {
     public boolean up(driver d)
    {
        boolean flag=false;
        try 
        {
            Configuration cf=new Configuration();
            cf.configure();
            SessionFactory sf = cf.buildSessionFactory();
            Session session1 =sf.openSession();
            session1 =sf.openSession();
            Transaction tx = session1.beginTransaction();
             String sql = "update driver set id='"+ d.getId()+"' name='"+d.getName()+"',age='"+ d.getAge()+"',ln='"+ d.getLn()+"' salary='"+ d.getSalary()+"'";
            Query query = session1.createQuery(sql);
           int i= query.executeUpdate();
            tx.commit();
           if(i!=0)
           {
               flag=true;
           }
           else 
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

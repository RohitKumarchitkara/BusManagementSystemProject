
package model;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class deleteRouteDAO {
        public boolean check1(route r)
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
             String sql = "delete from route where rcode='"+r.getRcode()+"' and rname='"+r.getRname()+"'";
            Query query = session1.createQuery(sql);
           int i= query.executeUpdate();
            tx.commit();
           if(i!=0)
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


package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class deleteDAO {
//     public boolean check(delete d)
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
//          
//           stmt.executeUpdate("delete from driver1 where DID='"+d.getId()+"' and DName='"
//                     + d.getName()+"'"); 
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
    public boolean check(delete d)
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
             String sql = "delete from driver where id='"+d.getId()+"' and name='"+ d.getName()+"'";
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



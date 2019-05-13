
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

public class userDao {
//    public boolean check(user u)
//    {
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
//             String qr = "select *from sign1 where uname='"+u.getName()+"' and upassword='"
//                     + u.getPass()+"'";
//             ResultSet rs = stmt.executeQuery(qr);
//             flag = rs.next();
//            
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//        return flag;
//    }
      public boolean check(user u)
    {
        boolean flag=false;
        try 
        {
            Configuration cf=new Configuration();
            cf.configure("cfgpackage/hibernate1.cfg.xml");
            SessionFactory sf = cf.buildSessionFactory();
            Session session1 =sf.openSession();
            session1 =sf.openSession();
            Transaction tx = session1.beginTransaction();
            String sql = "from Sign1 where name='"+u.getName()+"' and password='"
                     +u.getPass()+"'";
//             String sql =   "from sign where name='"+u.getName()+"' and password='"+ u.getPass()+"'";
            Query query = session1.createQuery(sql);
           //int i= query.executeUpdate();
//           query.setParameter(u.getName(), ());
           ArrayList<Sign1> s1 = (ArrayList<Sign1>)query.list();
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



package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class adminDAO {
//      public boolean check(admin u)
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
//             String qr = "select *from admintable where aname='"+u.getName()+"' and apassword='"
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
     public boolean check(admin1 u)
    {
        admin1 db = null;
        Configuration cf = new Configuration();
        cf.configure();
        SessionFactory sf = cf.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx = session.beginTransaction();
        db = (admin1)session.get(admin1.class,u.getName());
        
        tx.commit();
        session.close();
        sf.close();
        
        if(db==null)
        {
            return false;
        }
        else 
        {
          return u.equals(db);
        }
    }
    
}


package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class deletebusDao {
     public boolean check1(deletebus d)
    {
        
        boolean flag=false;
        try
        {
                        Class.forName("com.mysql.cj.jdbc.Driver");
 
            String url="jdbc:mysql://localhost:3306/busman";
            String name="root";
            String pwd = "";
            Connection con =DriverManager.getConnection(url,name,pwd);
            Statement stmt = con.createStatement();
          
           stmt.executeUpdate("delete from busdetail2 where Bid='"+d.getBId()+"' and Dname='"
                     + d.getName()+"' and Did='"+d.getDId()+"'"); 
            
             flag = true;
         
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
}

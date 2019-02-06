
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class deleteDAO {
     public boolean check(delete d)
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
          
           stmt.executeUpdate("delete from driver1 where DID='"+d.getId()+"' and DName='"
                     + d.getName()+"' and DLN='"+d.getLn()+"'"); 
            
             flag = true;
         
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
}



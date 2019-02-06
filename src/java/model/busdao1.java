
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class busdao1 {
     public boolean add(bus d)
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
           stmt.executeUpdate("insert into busdetail2(Bid,Did,Dname,Dcontact,Dfrom,Arival,Time) values ('" + d.getBId() + "','" + d.getDId() + "','" + d.getName() + "','" + d.getContact() + "','" + d.getDeparture() + "','" + d.getArival() +"','"+ d.getTime()+"')"); 
            
             flag = true;
         
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
}

 
package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class admin1 {
      @Id
      private String uname;
    private String pwd;
    public void setName(String uname)
    {
        this.uname=uname;
    }
    public String getName()
    {
        return this.uname;
    }
    public void setPass(String pwd)
    {
        this.pwd=pwd;
    }
    public String getPass()
    {
        return this.pwd; 
    }
    public boolean equals(Object o)
    {
        admin1 u =(admin1) o;
        if(uname.equals(u.getName()) && pwd.equals(u.getPass()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

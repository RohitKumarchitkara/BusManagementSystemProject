
package model;

public class user {
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
        user u =(user) o;
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

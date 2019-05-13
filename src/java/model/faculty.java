/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ROHIT
 */
public class faculty {
     private String email;
    private String pwd;
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getEmail()
    {
        return this.email;
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
        faculty u =(faculty) o;
        if(email.equals(u.getEmail()) && pwd.equals(u.getPass()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

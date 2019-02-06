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
public class delete {
     private String id;
    private String name;
    private String ln;
    public void setId(String id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
   
   
    public void setLn(String ln)
    {
        this.ln=ln;
    }
    public String getId()
    {
        return this.id; 
    }
     public String getName()
    {
        return this.name; 
    }

        public String getLn()
    {
        return this.ln; 
    }
    public boolean equals(Object o)
    {
        delete d =(delete) o;
      if(id.equals(d.getId()) && name.equals(d.getName())  && ln.equals(d.getLn()))
        {
           return true;
        }
        else
        {
            return false;
        }
   }
}

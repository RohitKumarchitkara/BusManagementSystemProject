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
public class search {
            private String id;
    private String name;

    public void setId(String id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
   
   
   
    public String getId()
    {
        return this.id; 
    }
     public String getName()
    {
        return this.name; 
    }

  
    public boolean equals(Object o)
    {
        delete d =(delete) o;
      if(id.equals(d.getId()) && name.equals(d.getName()))
        {
           return true;
        }
        else
        {
            return false;
        }
   }    
}

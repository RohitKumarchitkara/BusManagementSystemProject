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
public class driver {
    private String id;
    private String name;
    private String salary;
    private String age;
    private String ln;
    public void setId(String id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setSalary(String salary)
    {
        this.salary=salary;
    }
    public void setAge(String age)
    {
        this.age=age;
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
      public String getSalary()
    {
        return this.salary; 
    }
       public String getAge()
    {
        return this.age; 
    }
        public String getLn()
    {
        return this.ln; 
    }
    public boolean equals(Object o)
    {
        driver d =(driver) o;
      if(id.equals(d.getId()) && name.equals(d.getName()) && salary.equals(d.getSalary()) && age.equals(d.getAge()) && ln.equals(d.getLn()))
        {
           return true;
        }
        else
        {
            return false;
        }
   }
}

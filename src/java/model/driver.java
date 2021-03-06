
package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dd")
public class driver {
    @Id
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

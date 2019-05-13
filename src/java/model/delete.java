
package model;

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

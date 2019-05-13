
package model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class faculty1 {
     private String name;
    @Id
    private String uid;
    private String password;
     private String email;
    private String route;
 

   

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
     public boolean equals(Object o)
    {
        Sign1 s =(Sign1) o;
        if(name.equals(s.getName()) && uid.equals(s.getUid()) && password.equals(s.getPassword()) && email.equals(s.getEmail()) && route.equals(s.getRoute()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

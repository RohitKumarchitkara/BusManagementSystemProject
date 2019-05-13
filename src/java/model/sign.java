
package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sign1")
public class sign {
    @Id
    private String email;
    private String name;
    private String password;
    private String r_password;
    private String route;
 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getR_password() {
        return r_password;
    }

    public void setR_password(String r_password) {
        this.r_password = r_password;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     public boolean equals(Object o)
    {
        sign s =(sign) o;
        if(name.equals(s.getName()) && password.equals(s.getPassword()) && r_password.equals(s.getR_password()) && email.equals(s.getEmail()) && route.equals(s.getRoute()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

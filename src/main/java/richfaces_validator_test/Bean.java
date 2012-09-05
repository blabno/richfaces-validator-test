package richfaces_validator_test;

import org.hibernate.validator.constraints.Email;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@ViewScoped
@Named
public class Bean implements Serializable {
// ------------------------------ FIELDS ------------------------------

    @Email
    private String email;

// --------------------- GETTER / SETTER METHODS ---------------------

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

// -------------------------- OTHER METHODS --------------------------

    public void login()
    {
        System.out.println("Log in attempt: " + email);
    }
}

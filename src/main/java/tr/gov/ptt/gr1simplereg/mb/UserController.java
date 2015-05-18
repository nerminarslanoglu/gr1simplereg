/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.gr1simplereg.mb;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import tr.gov.ptt.gr1simplereg.dto.User;

/**
 *
 * @author Administrator
 */
public class UserController {
    
    private User registrationUser;

    public UserController() {
        this.registrationUser = new User();
    }

    
    
    public User getRegistrationUser() {
        return registrationUser;
    }

    public void setRegistrationUser(User registrationUser) {
        this.registrationUser = registrationUser;
    }
    
    public String register() 
    {
        System.out.println("");
        String msg = "User regisred succesfully";
           FacesContext.getCurrentInstance().addMessage(msg, new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg) );
           
           //yukarıdaki mesajı sayfaya yönlendirirken saklaması için
           FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
           return "registration.jsf?faces-redirect=true";
    }
    
}

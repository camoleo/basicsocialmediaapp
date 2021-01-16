package com.camoleo.basicsocialmediaapp.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {

    @Size(min = 2, max = 30,message = "\n" + "Username should be 2 to 30 characters long")
    private String userName;

    @NotNull
    @Size(min = 8, max = 30)
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package com.camoleo.basicsocialmediaapp.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class PostForm {

    @NotNull
    @Size(min = 2, max = 30, message = "Title size should be in the range [2...30]")
    private String title;

    @Size(max = 100, message = "This is the max content size")
    private String text;

//    @Size(max=50)
//    private String userName;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

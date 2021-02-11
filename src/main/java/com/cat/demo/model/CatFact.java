package com.cat.demo.model;

import java.util.Date;

public class CatFact {
    private String text;
    private Date createdAt;
    private Date updatedAt;

    @Override
    public String toString() {
        return "text: " + text+"<br />";
    }
}

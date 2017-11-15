package com.example.macmine.movingtabs.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by macmine on 14/11/17.
 */

public class Catogries implements Serializable{
    
    String Title;
    
    HashMap<String, ArrayList<String>> title_subcatogries;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public HashMap<String, ArrayList<String>> getTitle_subcatogries() {
        return title_subcatogries;
    }

    public void setTitle_subcatogries(HashMap<String, ArrayList<String>> title_subcatogries) {
        this.title_subcatogries = title_subcatogries;
    }
}

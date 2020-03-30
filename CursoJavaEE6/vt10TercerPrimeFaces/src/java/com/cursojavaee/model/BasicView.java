/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursojavaee.model;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author francisco
 */
@Named(value = "basicView")
@RequestScoped
public class BasicView {
    
    private String text;
    
    /**
     * Creates a new instance of BasicView
     */
    public BasicView() {
    }
    
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    
}

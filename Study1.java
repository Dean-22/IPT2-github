package com.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class Calculator {
    @WebMethod
    
    public String Name(String name){
        return name;
    }
}

package com.cc.java;

import com.cc.java.interfaces.Flyable;
import com.cc.java.interfaces.IFeathers;

public class Bird implements Flyable, IFeathers{

    @Override
    public String fly() {
        // TODO Auto-generated method stub
        return "I'm a bird I can also fly";
    }

    @Override
    public String hasFeathers() {
        // TODO Auto-generated method stub
        return "I'm a bird, I have feathers";
    }
    
}

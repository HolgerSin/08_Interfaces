package com.cc.java;

public class Worker extends HoneyBee{
    
    public String doYourJob(){
        return "I'm a worker, I work all day!";
    }

    @Override
    public String fly() {
        return "I' a worker, I fly at 12mph.";
    }

}


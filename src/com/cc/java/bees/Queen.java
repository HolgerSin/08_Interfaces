package com.cc.java.bees;

public class Queen extends HoneyBee{
    
    public String doYourJob(){
        return "I'm a Queen, any questions?";
    }

    @Override
    public String fly() {
        
        return "I'm a queen, I fly at 12mph";
    }

}

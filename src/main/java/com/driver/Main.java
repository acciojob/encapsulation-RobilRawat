package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
       // obj.name="Robil";   name variable is a private member

        obj.setName("Robil");
        obj.getName();


    }
  
}
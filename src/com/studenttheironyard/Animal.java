package com.studenttheironyard;

/**
 * Created by hoseasandstrom on 5/24/16.
 */
public class Animal {
    String name;

    public void makeSound(){
        System.out.println("Animal sound!!!");
    }

    @Override
    public String toString() {
        return name;
    }
}

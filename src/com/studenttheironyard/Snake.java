package com.studenttheironyard;

/**
 * Created by hoseasandstrom on 5/24/16.
 */
public class Snake extends Animal {
    public Snake(){
        this.name = "Snake";
    }
    @Override
    public void makeSound() {
        System.out.println("Sssssssss...");
    }
}

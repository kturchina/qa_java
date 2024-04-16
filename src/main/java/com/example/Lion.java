package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    public Lion(String sex, Feline animal) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
        this.animal = animal;
    }

    final Feline animal;

    public int getKittens() {
        return animal.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return animal.eatMeat();
    }
}

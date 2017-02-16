package ZooPractice;

import Module4offline.Animal;

/**
 * Created by Vladislav on 16.02.2017.
 */
public abstract class Reptile extends Animal {
    @Override
    public void feed() {
        System.out.println("Reptile eats reptile food");
    }
}

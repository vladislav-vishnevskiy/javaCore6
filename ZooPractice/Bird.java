package ZooPractice;

import Module4offline.Animal;

/**
 * Created by Vladislav on 16.02.2017.
 */
public abstract class Bird extends Animal {
    @Override
    public void feed() {
        System.out.println("Bird eats bird food");
    }
}

package ZooPractice;

import Module4offline.Animal;

/**
 * Created by Vladislav on 16.02.2017.
 */
public class Zoo {
    public static void main(String[] args) {
        Animal[] zooArray = new Animal[3];
        zooArray[0] = new Owl();
        zooArray[1] = new Gorila();
        zooArray[2] = new Crocodile();
        feedAllAnimal(zooArray);
    }

    private static void feedAllAnimal(Animal[] animalsArray) {
        for (Animal animal : animalsArray) {
            animal.feed();
        }
    }
}

package Module4offline;

/**
 * Created by Vladislav on 16.02.2017.
 */
public class Zoo {
    public static void main(String[] args) {
        Animal[] animalsArray = new Animal[2];
        animalsArray[0] = new Monkey();
        animalsArray[1] = new Elephant();
        feedAllAnimal(animalsArray);
    }

    private static void feedAllAnimal(Animal[] animalsArray) {
        for (Animal animal : animalsArray) {
            animal.feed();
        }
    }
}

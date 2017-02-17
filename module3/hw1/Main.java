package module3.hw1;
/**
 Добавить метод sing к классу Bird, потом измените основной метод соответственно, чтобы код вывел следующий текст:
 I am walking
 I am flying
 I am singing
 I am Bird
 */
public class Main {
    public static void main(String[] args) {
        Bird myBird = new Bird();
        myBird.sing("walking");
        myBird.sing("flying");
        myBird.sing("singing");
        myBird.sing("Bird");
    }

}

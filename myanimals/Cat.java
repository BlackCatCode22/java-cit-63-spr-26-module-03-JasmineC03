package myanimals;

public class Cat {

    public static final int MAX_LIVES = 9;

    private static int catCount = 0;

    String name;

    int age;

    int livesRemaining;

    public void meow() {
        System.out.println("Meow");
    }
    // constructor
    public Cat () {
        catCount++; // keeping track of number of cats
        livesRemaining = MAX_LIVES; // adding the max lives of cats
    }

    public static int getCatCount() {
        return catCount;
    }

    public static int numOfAnimals() {
            return Cat.getCatCount() + Dog.getDogCount();
            // Adding the cat count with the dog count from their classes to get total of animal count.
        }

}

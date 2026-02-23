package myanimals;

public class Dog {
    String name;
    int age;
    private static int dogCount = 0;

    public void bark() {
        System.out.println("Bark!");
    }
    // constructor
    public Dog () {

        dogCount++; // keeping track of number of dogs
    }

    public static int getDogCount() {

        return dogCount;
    }
}

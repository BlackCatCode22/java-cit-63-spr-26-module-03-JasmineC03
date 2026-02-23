package myanimals;

public class Animal {
    public static void main(String[] args) {

        String type;

        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Stella";
        myCat.age = 8;

        Cat myCat2 = new Cat();
        myCat2.name = "Ren";
        myCat2.age = 2;

        Cat myCat3 = new Cat();
        myCat3.name = "Mia";
        myCat3.age = 7;

        Dog myDog = new Dog();
        myDog.bark();
        myDog.name = "Fin";
        myDog.age = 3;

        Dog myDog2 = new Dog();
        myDog2.name = "Neo";
        myDog2.age = 7;

//        public static int numOfAnimals() {
//            return Cat.getCatCount() + Dog.getDogCount();
//        }

        // Note: Should always access static methods through the class and not through any other objects.
//        System.out.println(Cat.MAX_LIVES);
//        System.out.println(Cat.getCatCount());
//        System.out.println(Dog.getDogCount());

        // printing out the numOFAnimals called from the cat class.
        System.out.println(Cat.numOfAnimals());

    }
}

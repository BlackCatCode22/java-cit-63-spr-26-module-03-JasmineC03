package mystuff;

public class Driver {
    public static void main(String[] args) {
        MyStuff myStuff = new MyStuff();
        myStuff.sanitizerStuff = "Kleenax";
        myStuff.drink = "Cola";
        myStuff.snack = "Chips";
;       myStuff.electronic = "Phone";
        myStuff.travelBag = 5;
        myStuff.fullTank = true;

        System.out.println("I have " + myStuff.sanitizerStuff + ", a " + myStuff.drink + ", " + myStuff.snack + ", my "
                + myStuff.electronic + ", and " + myStuff.travelBag + " travel bags.");
        System.out.println("Vehicle is full tank: " + myStuff.fullTank);
    }
}

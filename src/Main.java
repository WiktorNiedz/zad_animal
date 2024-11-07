import java.util.Scanner;
interface Animal {
    void sound();
    default void eat(){
        System.out.println("zwierze je");
    }
    default void sleep() {
        System.out.println("This animal is going to sleep.");
    }




    static String getEndOfTheDay() {
        return "This animal is going to sleep.";
    }
}

class Cow implements Animal {
    public void sound() {
        System.out.println("mooo moooo");
    }
}

class Bird implements Animal {
    public void sound() {
        System.out.println("tweet tweet tweet tweet");
    }

}

class Dog implements Animal {
    public void sound() {
        System.out.println("The dog barks: Woof Woof!");

    }
}
class Cat implements Animal {
    public void sound() {
        System.out.println("The cat mial mail");
    }
}



public class Main {
    public static void main(String[] args) {
        Dog mydog = new Dog();
        mydog.sound();
        mydog.sleep();
        mydog.eat();
        Cat mycat = new Cat();
        mycat.sound();
        mycat.sleep();
        mycat.eat();
        Bird mybird = new Bird();
        mybird.sound();
        mybird.sleep();
        mybird.eat();
        Cow mycow = new Cow();
        mycow.sound();
        mycow.sleep();
        mycow.eat();
        System.out.print(Animal.getEndOfTheDay());


    }




}
package OOP2;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.greeting();
        Main.fun();
    }

    // this is not dependent on objects
    static void fun() {
        // greeting(); // you can't use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // You cannot access non static stuff without referencing
        // their instances in a static context

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    // Something which is not static belongs to an objects
    void greeting() {
        // fun();
        System.out.println("Hello World");
    }
}

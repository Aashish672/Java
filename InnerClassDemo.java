class Outer {

    // Inner class
    class Inner {
        void display() {
            System.out.println("Hello from the Inner class!");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {

        // Step 1: Create object of Outer class
        Outer outer = new Outer();

        // Step 2: Create object of Inner class using Outer object
        Outer.Inner inner = outer.new Inner();

        // Step 3: Call method of Inner class
        inner.display();
    }
}

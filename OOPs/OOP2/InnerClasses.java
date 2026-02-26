package OOP2;

public class InnerClasses {
    static class Test {
        static String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Aashish");
        Test b = new Test("Shashi");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

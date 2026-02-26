package OOP1;

public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[5];
        Student aashish = new Student();
        System.out.println(aashish.name);
    }
}

class Student {
    int rno;
    String name;
    float marks;

    Student() {
        this(1, "Aashish", 52.4f);
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}

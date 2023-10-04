/* Types of Constructor : Non-parameterized
Parameterized
Copy Constructor */

public class Constructor_types {
    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student("Naveen Sharma");

        Student s3 = new Student(105);

        s1.marks = 95;
        System.out.println("Name : " + s2.name);
        System.out.println("Roll number : " + s3.rollno);
        System.out.println("Marks : " + s1.marks);

        Student s4 = new Student(45);
        s4.name = "Xyz";
        s4.marks = 78;

        Student s5 = new Student(s4);
        System.out.println(s5.name);
        System.out.println(s5.rollno);
        System.out.println(s5.marks);
    }
}

class Student {
    String name;
    int rollno;
    int marks;

    Student() { // Non-parameterized Constructor
        System.out.println("Hello Welcome, Constructor is called.");
    }

    Student(String name) { // Parameterized Constructor
        this.name = name;
    }

    Student(int rollno) { // Parameterized Constructor
        this.rollno = rollno;
    }

    Student(Student s4) { // Copy Constructor
        this.name = s4.name;
        this.rollno = s4.rollno;
        this.marks = s4.marks;
    }
}

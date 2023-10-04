/* Constructor is a special method which is invoked automatically at the
time of object creation.
- Constructors have the same name as class or structure.
- Constructors don't have a return type. (Not even void)
- Constructors are only called once, at object creation.
- Memory allocation happens when constructor is called. 
*/

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Naveen";
    }
}

class Student {
    String name;
    int roll_no;

    // Note : constructor must have a same name as class name
    Student() {
        System.out.println("Hello Welcome, Constructor is called.");
    }
}

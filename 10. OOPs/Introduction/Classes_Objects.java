package Introduction;

public class Classes_Objects {
    public static void main(String[] args) {
        // Creating a pen Object called p1
        Pen p1 = new Pen();

        // Operations on object p1
        p1.changeColor("Blue");
        p1.ChangeTip(4);

        // Printing Pen details
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}

// Introduction creating a pen class first
class Pen {
    String color;
    int tip;

    void changeColor(String newColor) {
        color = newColor;
    }

    void ChangeTip(int newTip) {
        tip = newTip;
    }
}
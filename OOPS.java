public class OOPS{
    public static void main(String args[]){
        // static is access specifier
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println("Pen Color - "+p1.Color);

        Pen t1 = new Pen();
        t1.setThickness(2);
        System.out.println("Pen Thickness (in cm) - "+t1.Thickness);


    }
}


class Pen{
    // properties + functions
    String Color;
    int Thickness;

    void setColor(String newColor){
        Color = newColor;
    }

    void setThickness(int newThickness){
        Thickness = newThickness;
    }
}

class Student{
    String Name;
    int Rollno;
    float Percentage;

    void calcCGPA(int phy, int chem, int math){
        Percentage = (phy + chem + math)/3;
    }
}
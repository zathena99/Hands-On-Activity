import java.util.*;

//Polymorphism
//Part I
// Override methods in a superclass
// 1. Create a class named RunQuad. This class shall contain the main method.
// 2. Add three (3) classes named Quadrilateral, Rectangle, and Square. Rectangle shall inherit from
// Quadrilateral while Square shall inherit from Rectangle.
// 3. Declare a public method named showDescription() in all three (3) classes except in RunSquad.
// Customize each method by creating different println() statements.
//      a. For Quadrilateral: "- is quadrilateral".
//      b. For Rectangle: "- has 4 right angles". Add a super() statement to call Quadrilateral's method.
//      c. For Square: "- has 4 equal sides". Add a super() statement to call Rectangle's method.
// 4. Code the main method of the RunQuad class. The output shall ask the user to press R or S to choose between rectangle and square. Display appropriate description(s).

//Part II
//Add three (3) more classes named Parallelogram, Rhombus, and Trapezoid.
//      a. Parallelogram shall inherit from Quadrilateral and shall be the new parent class of Rectangle. Its println() statement shall be "- has 2 pairs of parallel sides". 

//      b. Rhombus shall inherit from Parallelogram. Its println() statement shall be "- has 4 congruent sides".

//      c. Trapezoid shall inherit from Quadrilateral. Its println() statement shall be "- has 1 pair of parallel sides".

// 7. Modify the main method of the RunQuad class. The choices will now be R, S, P, H, and T. Display appropriate description(s).

public class RunQuad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================================");
        System.out.println("        Press (R) for Rectangle or (S) for Square        ");
        System.out.println("(P) for Parallelogram (H) for Rhombus (T) for Trapezoid");
        System.out.println("========================================================");
        System.out.println("                                                             ");
        System.out.println("+___________________+");
        System.out.println("|                   |");
        System.out.println("|R for Rectangle    |");
        System.out.println("|===================|");
        System.out.println("|S for Square       |");
        System.out.println("|===================|");
        System.out.println("|P for Parallelogram|");
        System.out.println("|===================|");
        System.out.println("|H for Rhombus      |");
        System.out.println("|===================|");
        System.out.println("|T for Trapezoid    |");
        System.out.println("|___________________|");
        System.out.println("vvvv Input Here! vvvv");
        String choice = sc.nextLine().toUpperCase();
        if (choice.equals("R")) {
            System.out.println("Rectangle: \n" + new Rectangle().showDescription());
        } else if (choice.equals("S")) {
             System.out.println("Square: \n" + new Square().showDescription());
        } else if (choice.equals("P")) {
            System.out.println("Parallelogram: \n" + new Parallelogram().showDescription());
        } else if (choice.equals("H")) {
            System.out.println("Rhombus: \n" + new Rhombus().showDescription());
        } else if (choice.equals("T")) {
            System.out.print("Trapezoid: \n" + new Trapezoid().showDescription());
        } else {
            System.out.println("=================================");
            System.out.println("Invalid choice. Please try again.");
            System.out.println("=================================");
        }
        System.out.println("=================================");
    }
}

class Quadrilateral {

    public String showDescription() {
        return "- is a quadrilateral\n";
    }
}

class Rectangle extends Quadrilateral {

    public String showDescription() {
        return super.showDescription() + "- has 4 right angles";
    }
}

class Square extends Rectangle {

    public String showDescription() {
        return super.showDescription() + "- has 4 equal sides";
    
    }
}

class Parallelogram extends Quadrilateral {

    public String showDescription() {
        return super.showDescription() + "- has 2 pairs of parallel sides\n";
        
    }
}

class Rhombus extends Parallelogram {

    public String showDescription() {
        return super.showDescription() + "- has 4 congruent sides\n";
    }
}

class Trapezoid extends Quadrilateral {

    public String showDescription() {
        return super.showDescription() + "- has 1 pair of parallel sides\n";
    }
}

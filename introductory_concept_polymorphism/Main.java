package introductory_concept_polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape Cshape = new Circle(2);
        Shape Rshape = new Rectangle(2, 2);
        Shape Tshape = new Triangle(2, 3);

        ShapeCalculator calc = new ShapeCalculator();

        
        calc.printArea(Cshape);
        calc.printArea(Rshape);
        calc.printArea(Tshape);

    }
}

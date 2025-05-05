package introductory_concept_polymorphism.Exercise_polymorphism;

public class Main {
    public static void main(String [] args){
        Shape [] shape = {
            new Circle(3.0),
            new Rectangle(4.0, 5.0),
            new Triangle(6.0, 4.0),
        };

        for (Shape s : shape){
            double area = s.area();

            s.describe();
            // System.out.println();
            System.out.printf("Area: %.2f%n%n",area);
        }
    }
}

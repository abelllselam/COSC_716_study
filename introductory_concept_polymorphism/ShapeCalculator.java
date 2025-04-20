package introductory_concept_polymorphism;

public class ShapeCalculator {
    
    public void printArea(Shape shape){
        System.out.printf("Area of %s is: %.2f%n",shape.getClass().getSimpleName(), shape.area() );
    }
}

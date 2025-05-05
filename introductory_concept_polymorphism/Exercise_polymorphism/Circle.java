package introductory_concept_polymorphism.Exercise_polymorphism;

public class Circle extends Shape  {
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI *(radius*radius);
    }

    @Override
    public void describe(){
        System.out.printf("I am a circle of radius %.2f%n", radius);
        
    }
}

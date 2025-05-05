package introductory_concept_polymorphism.Exercise_polymorphism;

public class Triangle extends Shape {
    double base;
    double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double area(){
        return (base*height)/2;
    }

    @Override
    public void describe(){
        System.out.println("I am a triangle with base "+ base + " and " + "height " + height + "%n");
        
    }
}

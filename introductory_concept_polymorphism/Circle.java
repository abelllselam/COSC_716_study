package introductory_concept_polymorphism;

public class Circle implements Shape {
    double cArea;
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return cArea= Math.PI *(this.radius*this.radius);
    }
}

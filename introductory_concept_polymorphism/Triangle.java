package introductory_concept_polymorphism;

public class Triangle implements Shape {
    double base;
    double height;

    public Triangle (double base, double height){
        this.height = height;
        this.base = base;

    }
    public double area(){
        return (this.height * this.base)/2;
    };
}

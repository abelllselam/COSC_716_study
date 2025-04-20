package introductory_concept_polymorphism;

public class Rectangle implements Shape {
        double width;
        double height;
    public Rectangle (double width, double height){
        this.height = height;
        this.width = width;

    }
    public double area(){
        return this.height * this.width;
    };
}

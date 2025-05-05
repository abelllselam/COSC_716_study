package introductory_concept_polymorphism.Exercise_polymorphism;

public class Rectangle extends Shape  {
    double width;
    double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double area(){
        return width * height;
    }

    @Override
    public void describe(){
        System.out.println("I am a rectangle of width%n" + this.width + " and height " + this.height);
        
    }
}

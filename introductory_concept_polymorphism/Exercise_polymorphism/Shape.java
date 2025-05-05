package introductory_concept_polymorphism.Exercise_polymorphism;

abstract public class Shape {
    String name;

    abstract public double area();

    public void describe(){
        System.out.println("I am a generic shape.");
    }
    
}

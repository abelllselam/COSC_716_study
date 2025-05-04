public class Bird extends Animal implements Movable {


    @Override
    public void move(){
        System.out.println("Bird is moving");
    }

    @Override
    public void stop(){
        System.out.println("Bird has stopped.");
    }

    @Override
    public void makeSound(){
        System.out.println("Chirp chirp!");
    }
    
    
}

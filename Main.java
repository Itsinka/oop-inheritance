import java.util.ArrayList;

public class Main {
    public static void main (String[]args){
        ArrayList<Animal>animals= new ArrayList<>();
        animals.add(new Cat("Thomas"));
        animals.add(new Dog("Rex"));
        animals.add(new Fox("Firefox"));
        for (Animal a: animals){
            System.out.print(a.getName()+ " says ");
            a.makeSound();
        }
    }
}

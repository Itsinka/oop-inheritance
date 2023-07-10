public class Cat extends Animal{
    public Cat (String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
    @Override
    public String toString(){
        return "cat: name = "+ getName();
    }
}

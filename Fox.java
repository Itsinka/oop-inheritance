public class Fox extends Animal{
    public Fox(String name){
        super(name);

    }
    @Override
    public void makeSound(){
        System.out.println("Ding-ding-ding");
    }

    @Override
    public String toString() {
        return "Fox: name = "+getName();
    }
}

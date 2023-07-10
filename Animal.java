public abstract class Animal {
    private String name;
    public Animal(String name){
        setName(name);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public abstract void makeSound();
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    @Override
    public String toString() {
        return "Animal: name = "+ name;
    }
}

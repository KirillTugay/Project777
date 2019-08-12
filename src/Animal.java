

public class Animal {

    public static void main(String[] args) {
        Animal spider = new Animal(1);
        spider.displayAge();
        Cat cat = new Cat(2);
        cat.meow();
        cat.displayAge();
        Dog dog = new Dog(20);
        dog.gav();
        dog.displayHeight();
        Fox fox = new Fox(30);
        fox.fuk();
        fox.displayWeight();

    }
    int weight;
    String type;
    int height;
    String color;
    String location;
    int age;
    boolean wild;
    boolean vegan;

    Animal(int height, int weight){
        this.height=height;
        this.weight=weight;
    }

    Animal(int weight, int age, String type, String location){
        this.weight=weight;
    }


    public void displayWeight(){
        System.out.println(weight);
    }
    public void displayType(){
        System.out.println(type);
    }
    public void displayHeight(){
        System.out.println(height);
    }
    public void displayColor(){
        System.out.println(color);
    }
    public void displayLocation(){
        System.out.println(location);
    }
    public void displayAge(){
        System.out.println(age);
    }
    public void displayWild(){
        System.out.println(wild);
    }
    public void displayVegan(){
        System.out.println(vegan);
    }
}

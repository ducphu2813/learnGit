public class Main{
    public static void main(String[] args){
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();
        Animal myDog = new Dog();
        System.out.println(((Animal) myAnimal).getSou());
        System.out.println(((Cat) myCat).getSou());
        System.out.println(((Dog) myDog).getSou());
    }
}


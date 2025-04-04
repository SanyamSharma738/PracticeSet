//Interfaces example to see multiple inheritance
interface Swimable{
    void swim();
}
interface Flyable{
    void fly();
}
class Shark implements Swimable{
    @Override
    public void swim() {
        System.out.println("Shark is Swimming");
    }
}
class Eagle implements Flyable{
    @Override
    public void fly() {
        System.out.println("Eagle is Flying");
    }
}
class Duck implements Swimable,Flyable{
    @Override
    public void swim() {
        System.out.println("Duck can Swim");
    }

    @Override
    public void fly() {
        System.out.println("Duck can Fly");
    }
}

public class Main {
    public static void main(String[] args) {
        Shark sh = new Shark();
        sh.swim();
        Eagle egl = new Eagle();
        egl.fly();
        Duck dc = new Duck();
        dc.swim();
        dc.fly();
    }
}

package InterfaceAbstractSamples;

public abstract class Animal {
    abstract void sound();

    public void eat() {
        System.out.println("eat");
    }
}
class dog extends Animal{
    @Override
    void sound(){
        System.out.println("hav hav");
    }
}

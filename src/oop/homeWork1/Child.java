package oop.homeWork1;

public class Child extends Human implements IMather, IFather {

    private Father father;
    private Mather mather;

    public Child(String name, Integer age, Character male, String socialStatus) {
        super(name, age, male, socialStatus);
    }

    public Child(String name, Integer age, Character male, String socialStatus, Father father, Mather mather) {
        super(name, age, male, socialStatus);
        this.father = father;
        this.mather = mather;
    }

    public Human getFather() {
        return father;
    }
    public Human getMather() {
        return mather;
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println(" я ребенок!");
    }

    @Override
    public void getPower() {
        System.out.println("Моя сила = 15");
    }

    @Override
    public void getFlexibility() {
        System.out.println("Моя гибкость = 30");
    }
}

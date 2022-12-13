package oop.homeWork1;

public class Child extends Human {

    private Father father;
    private Mather mather;

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
}

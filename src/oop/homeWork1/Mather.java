package oop.homeWork1;

import java.util.LinkedHashSet;

public class Mather extends Human implements IMather {

    private LinkedHashSet<Human> children = new LinkedHashSet<>();

    public Mather(String name, Integer age, Character male, String socialStatus) {
        super(name, age, male, socialStatus);
    }

    public void addChildren(Human child) {
        children.add(child);
    }

    public LinkedHashSet<Human> getChildren() {
        return children;
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println(" я мать!");
    }

    @Override
    public void getFlexibility() {
        System.out.println("Моя гибкость = 20");
    }
}

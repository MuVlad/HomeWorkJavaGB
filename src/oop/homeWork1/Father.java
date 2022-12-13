package oop.homeWork1;

import java.util.LinkedHashSet;

public class Father extends Human {

    private LinkedHashSet<Human> children = new LinkedHashSet<>();

    public Father(String name, Integer age, Character male, String socialStatus) {
        super(name, age, male, socialStatus);
    }

    public void addChildren(Human children) {
        this.children.add(children);
    }

    public LinkedHashSet<Human> getChildren() {
        return children;
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println(" я отец!");
    }
}

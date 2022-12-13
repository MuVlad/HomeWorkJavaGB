package oop.homeWork1;

public class Main {
    public static void main(String[] args) {
        Mather mather = new Mather("Светлана", 48,'ж',"мать");
        Father father = new Father("Олег", 52, 'м',"отец");
        Child child1 = new Child("Степа",5,'м',"ребенок",father,mather);
        Child child2 = new Child("Женя",19,'ж',"ребенок",father,mather);

        mather.sayHello();
        father.sayHello();
        child1.sayHello();
        child2.sayHello();
        mather.addChildren(child1);
        mather.addChildren(child2);
        father.addChildren(child1);
        father.addChildren(child2);
        System.out.println(mather.getChildren());
        System.out.println(father.getChildren());
        System.out.println("моя мама " + child1.getMather());
        System.out.println("мой папа " + child2.getFather());

    }
}

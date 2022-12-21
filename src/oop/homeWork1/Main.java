package oop.homeWork1;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Mather mather = new Mather("Светлана", 48, 'ж', "мать");
        Father father = new Father("Олег", 52, 'м', "отец");
        Child child1 = new Child("Степа", 5, 'м', "ребенок", father, mather);
        Child child2 = new Child("Женя", 19, 'ж', "ребенок", father, mather);

        Predicate<Human> isChild = x -> x.getSocialStatus().equals("ребенок");
        Consumer<Human> socialStatusInfo = x -> System.out.println(x.getSocialStatus());
        Supplier<Human> createHuman = () -> {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите имя: ");
            String name = scan.nextLine();
            System.out.print("Введите возраст: ");
            Integer age = scan.nextInt();
            System.out.print("Введите пол(м/ж): ");
            String maleStr = scan.next();
            Character male = maleStr.charAt(0);
            System.out.print("Введите социальный статус(ребенок, мать, отце): ");
            String status = scan.next();
            switch (status) {
                case "ребенок":
                    return new Child(name, age, male, status);
                case "мать":
                    return new Mather(name, age, male, status);
                case "отец":
                    return new Father(name, age, male, status);
            }
            return new Human(name, age, male, status);
        };



        Human human = createHuman.get();
        socialStatusInfo.accept(child2);
        System.out.println(isChild.test(child1));
        System.out.println(isChild.test(mather));


//        mather.sayHello();
//        father.sayHello();
//        child1.sayHello();
//        child2.sayHello();
//        mather.addChildren(child1);
//        mather.addChildren(child2);
//        father.addChildren(child1);
//        father.addChildren(child2);
//        System.out.println(mather.getChildren());
//        System.out.println(father.getChildren());
//        System.out.println("моя мама " + child1.getMather());
//        System.out.println("мой папа " + child2.getFather());

//        child1.getFlexibility();
//        child1.askTheTime();
//        System.out.println(Mather.nose);
//        System.out.println(Father.colorHair);
//        IFather.laugh();


    }
}

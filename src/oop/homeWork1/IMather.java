package oop.homeWork1;

public interface IMather {
    String nose = "straight";
    String skinColo = "white";

    void getFlexibility();
    default void askTheTime() {
        System.out.println("Какое сейчас время?");
    }
}

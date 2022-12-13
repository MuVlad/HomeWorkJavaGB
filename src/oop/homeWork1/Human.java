package oop.homeWork1;

public class Human {

    private String name;
    private Integer age;
    private Character male;
    private String socialStatus;

    public Human(String name, Integer age, Character male, String socialStatus) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.socialStatus = socialStatus;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getMale() {
        return male;
    }

    public void setMale(Character male) {
        this.male = male;
    }

    public String getSocialStatus() {
        return socialStatus;
    }

    public void setSocialStatus(String socialStatus) {
        this.socialStatus = socialStatus;
    }

    public void sayHello() {
        System.out.printf("Привет, я %s!", name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", male='" + male + '\'' +
                ", socialStatus='" + socialStatus + '\'' +
                '}';
    }
}

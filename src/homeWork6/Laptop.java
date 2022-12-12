package homeWork6;

import java.util.Objects;

/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 * отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class Laptop {
    private String company;
    private String operatingSystem;
    private int ram;
    private int hardDiskCapacity;
    private int price;

    public Laptop(String company, String operatingSystem, int RAM, int hardDiskCapacity, int price) {
        this.company = company;
        this.operatingSystem = operatingSystem;
        this.ram = RAM;
        this.hardDiskCapacity = hardDiskCapacity;
        this.price = price;

    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public void setHardDiskCapacity(int hardDiskCapacity) {
        this.hardDiskCapacity = hardDiskCapacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "company='" + company + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", ram=" + ram +
                ", hardDiskCapacity=" + hardDiskCapacity +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return company.equals(laptop.company) &&
                operatingSystem.equals(laptop.operatingSystem) &&
                ram == laptop.ram && hardDiskCapacity == laptop.hardDiskCapacity &&
                price == laptop.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, operatingSystem, ram, hardDiskCapacity, price);
    }

}
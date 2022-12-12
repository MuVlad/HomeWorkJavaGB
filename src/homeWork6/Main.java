package homeWork6;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Map<Integer, String> criteria = new HashMap<>();

    static {
        criteria.put(1, "company");
        criteria.put(2, "operatingSystem");
        criteria.put(3, "ram");
        criteria.put(4, "hardDiskCapacity");
        criteria.put(5, "price");
    }

    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("HP", "Windows", 8, 256, 30250));
        laptops.add(new Laptop("HP", "Linux", 4, 512, 60500));
        laptops.add(new Laptop("Acer", "Windows", 8, 256, 44250));
        laptops.add(new Laptop("Apple", "macOs", 16, 512, 120000));
        laptops.add(new Laptop("Apple", "macOs", 8, 512, 90000));
        laptops.add(new Laptop("Acer", "Linux", 16, 1024, 90500));
        laptops.add(new Laptop("Acer", "Windows", 4, 256, 25600));
        laptops.add(new Laptop("Msi", "Linux", 32, 1024, 123700));

        String requestCriterion = criteriaQuery();
        String requestSubCriterion = criteriaSubQuery(requestCriterion, laptops);
        filter(requestSubCriterion, requestCriterion, laptops);
    }

    private static String criteriaQuery() {
        System.out.println("1 - Фирма");
        System.out.println("2 - Операционная система");
        System.out.println("3 - ОЗУ");
        System.out.println("4 - Объем памяти");
        System.out.println("5 - Цена");
        System.out.print("Введите цифру, соответствующую необходимому критерию: ");
        return criteria.get(scanner.nextInt());
    }

    private static String criteriaSubQuery(String str, Set<Laptop> laptopSet) {
        List<String> positions = null;
        int positionNumber = 0;
        Set<String> setCriteria = new HashSet<>();
        switch (str) {
            case "company":
                for (Laptop laptop : laptopSet) {
                    setCriteria.add(String.valueOf(laptop.getCompany()));
                }
                positions = outputGoods(setCriteria);
                System.out.print("Выберите интрересующую вас фирму: ");
                positionNumber = scanner.nextInt();
                break;
            case "operatingSystem":
                for (Laptop laptop : laptopSet) {
                    setCriteria.add(String.valueOf(laptop.getOperatingSystem()));
                }
                positions = outputGoods(setCriteria);
                System.out.print("Выберите интрересующую вас опреационную систему: ");
                positionNumber = scanner.nextInt();
                break;
            case "ram":
                for (Laptop laptop : laptopSet) {
                    setCriteria.add(String.valueOf(laptop.getRam()));
                }
                positions = outputGoods(setCriteria);
                System.out.print("Выберите минимальный интересующий вас объем ОЗУ: ");
                positionNumber = scanner.nextInt();
                break;
            case "hardDiskCapacity":
                for (Laptop laptop : laptopSet) {
                    setCriteria.add(String.valueOf(laptop.getHardDiskCapacity()));
                }
                positions = outputGoods(setCriteria);
                System.out.print("Выберите минимальный интересующий вас объем памяти: ");
                positionNumber = scanner.nextInt();
                break;
            case "price":
                for (Laptop laptop : laptopSet) {
                    setCriteria.add(String.valueOf(laptop.getPrice()));
                }
                positions = outputGoods(setCriteria);
                System.out.print("Выберите минимальную интересующаю вас ценову: ");
                positionNumber = scanner.nextInt();
                break;
        }

        return positions.get(positionNumber - 1);
    }


    private static List<String> outputGoods(Set<String> setCriteria) {
        List<String> listCriteria = new ArrayList<>(setCriteria);
        for (int i = 0; i < listCriteria.size(); i++) {
            System.out.println(i + 1 + " - " + listCriteria.get(i));
        }
        return listCriteria;
    }


    private static void filter(String subCriteria, String criteria, Set<Laptop> laptopSet) {
        switch (criteria) {
            case "company":
                for (Laptop laptop : laptopSet) {
                    if (laptop.getCompany().equals(subCriteria)) {
                        System.out.println(laptop);
                    }
                }
                break;
            case "operatingSystem":
                for (Laptop laptop : laptopSet) {
                    if (laptop.getOperatingSystem().equals(subCriteria)) {
                        System.out.println(laptop);
                    }
                }
                break;
            case "ram":
                for (Laptop laptop : laptopSet) {
                    if (laptop.getRam() >= Integer.parseInt(subCriteria)) {
                        System.out.println(laptop);
                    }
                }
                break;
            case "hardDiskCapacity":
                for (Laptop laptop : laptopSet) {
                    if (laptop.getHardDiskCapacity() >= Integer.parseInt(subCriteria)) {
                        System.out.println(laptop);
                    }
                }
                break;
            case "price":
                for (Laptop laptop : laptopSet) {
                    if (laptop.getPrice() >= Integer.parseInt(subCriteria)) {
                        System.out.println(laptop);
                    }
                }
                break;
        }
    }
}

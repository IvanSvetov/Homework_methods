public class Main {
    public static void main(String[] args) {
        int year = 2020;
        isLeapYear(year);
        int clientOS = 1;
        int clientDeviceYear = 2014;
        client(clientOS, clientDeviceYear);
        int deliveryDays = 1;
        int deliveryDistance = 95;
        delivery(deliveryDays, deliveryDistance);
    }
    public static void isLeapYear(int year) {
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeapYear) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " невисокосный год");
        }
    }
    public static void client(int a, int b) {
        if (a == 0) {
            if (b < 2015) {
                System.out.println("Установите облегченную версию ПО");
            } else {
                System.out.println("Установите ПО");
            }
        } else {
            if (b < 2015) {
                System.out.println("Установите облегченную версию ПО");
            } else {
                System.out.println("Установите ПО");
            }
        }
    }
    public static void delivery(int x, int y) {
        if (y > 20) {
            x++;
        }
        if (y > 60) {
            x++;
        }
        System.out.println("Потребуется дней " + x);
    }
}
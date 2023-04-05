import java.time.LocalDate;

public class Main {
    public static void visokosniiGod(int year){
        if ((year%4==0)||(year % 400==0)&&(year%100!=0)){
            System.out.println(year+" год является високосным");}
        else
            System.out.println(year+" год не является високосным");
    }
    public static void clientOsYear(int clientDiviceYear) {

        if (clientDiviceYear < 2023) {
            System.out.println("Установите ограниченную версию приложения ");
        } else if (clientDiviceYear >= 2023) {
            System.out.println("Установите версию приложения ");
        }    }
    public static void clientOs(int clientOS) {
        if (clientOS == 0) {
            System.out.println("для IOS по ссылке");
        }
        if (clientOS == 1) System.out.println("для Android по ссылке");
    }
    public static void diliveryDistance(int diliveryDistsnce){
        if (diliveryDistsnce<=20)
            System.out.println("Потребуется 1 день");
        if (diliveryDistsnce>20&&diliveryDistsnce<60)
            System.out.println("Потребуется 2 дня");
        else if (diliveryDistsnce>60&&diliveryDistsnce<100)
            System.out.println("Потребуется 3 дня");

        else System.out.println("доставки нет");}


    public static void main(String[] args) {

        task1();
        task2();
        task3();}
    public static void task1() {
        System.out.println("Задача №1");
        int year = 2045;
        visokosniiGod(year);
    }
    public static void task2() { System.out.println("Задача №2");

        int currentYear = LocalDate.now().getYear();
        clientOsYear(currentYear);
        int clientOS = 0;
        clientOs(clientOS);


    }

    public static void task3() {
        System.out.println("Задача №3");
        int diliveryDistsnce=100;
        diliveryDistance(diliveryDistsnce);

    }
}
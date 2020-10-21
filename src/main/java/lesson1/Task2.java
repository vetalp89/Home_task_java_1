package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом for
*/

public class Task2 {

    public static void main(String[] args) {
        String name = "Vitalii";
        for (int s = 0; s <5 ; s++) {
            for (int c = 0; c <9 ; c++) {
                System.out.print(name+" "); }
            System.out.print(name);
            System.out.println(); }
        //s - строки, с - колонки(стовпчики)
    }
}
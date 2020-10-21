package lesson1;

/**
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */
public class Task5 {

    public static void main(String[] args) {
        String name = "Hello World";
        int leng = name.length();
        String rev = "";
        for (int i = leng - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println("Revers of: " + name + " is: " + rev);
    }
}
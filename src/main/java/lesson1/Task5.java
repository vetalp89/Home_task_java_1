package lesson1;

// Вхідне слово віддзеркалюємо. Розбиваємо вхідне та вихідне слова на массиви.
 
 
public class Task5 {

   public static void main(String[] args) {
        String name = "ABCDE";
        int leng = name.length();
        String rev = "";
        for (int i = leng - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println("Revers of: " + name + " is: " + rev);


        char[] result = name.toCharArray();
        System.out.println("Char array: ");
        for (int i = 0; i < result.length; i++)
            System.out.println("Element [" + i + "]: " + result[i]);


        char[] result2 = rev.toCharArray();
        System.out.println("Reverse: ");
        for (int j = 0; j < result2.length; j++)
            System.out.println("Element [" + j + "]: " + result2[j]);
    }
}

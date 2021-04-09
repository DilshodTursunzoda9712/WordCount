import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Вводим предложения в консоль
        System.out.print("Введите слова одной строкой через пробел :");
        String input = scan.nextLine();
        //начальное количество слов равно 0
        int count = 0;

        //Если ввели хотя бы одно слово, тогда считать, иначе конец программы
        if (input.length() != 0) {
            count++;
            //проверяем каждый символ, не пробел ли это
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    //если пробел - увеличиваем количество слов на 1
                    count++;
                }
            }
        }
        System.out.println("Вы ввели :" + count + " слов");
    }
}
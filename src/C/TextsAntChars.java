package C;

import java.util.Scanner;

public class TextsAntChars {
    // 1. Вывести в одну строку символы английского алфавита от A до Z

    public static void Alphabet() {
        for (char i = 'A'; i < 'Z'; i++) {
            System.out.print(i);
        }
    }

    // 1. Вывести в одну строку символы английского алфавита от z до a - НЕ РАБОТАЕТ

    public static void AlphabetZA() {
        char i;
        for (i = 'z'; i >= 'a'; i--) ;
        {
            System.out.print(i);
        }
    }


    // 1. Вывести в одну строку символы русского алфавита от а до я

    public static void AlphabetRus() {
        for (char i = 'а'; i < 'я'; i++) {
            System.out.print(i);
        }
    }


    // 1. Вывести в одну строку символы 0-9

    public static void Numbers() {
        int i;
        for (i = 0; i <= 9; i++) {
            System.out.print(i);
        }
    }

    // 1. Вывести в одну строку символы печaтного диапазона таблицы ASCII
    public static void ASCII() {
        for (char i = ' '; i < '}'; i++) {
            System.out.print(i);
        }
    }

// 2. Написать и протестировать функции преобразования: целого числа в строку

    public static void Transformation() {
        int num = 2;
        String str = Integer.toString(num);
        System.out.println(str);

    }

    // 2. Написать и протестировать функции преобразования: вещественного числа в строку (c плавающей точкой)

    public static void TransformationTwo() {
        double num = 2.78468468;
        String str = Double.toString(num);
        System.out.println(str);

    }

    // 2. Написать и протестировать функции преобразования: cтроки в целое число

    public static void TransformationThree() {
        String str = "777";
        int num = Integer.parseInt(str);
        System.out.println(num);

    }


    // 2. Написать и протестировать функции преобразования: cтроки в вещественное число

    public static void TransformationFour() {
        String str = "777";
        double num = Double.parseDouble(str);
        System.out.println(num);

    }

    // посчитать количество слов во введенной пользователем строке
    public static void HowMatch() {
                System.out.print("Введите слова в строку через пробел");
        Scanner scanner = new Scanner(System.in);
        String Go = scanner.nextLine();
        int start = 0;
        if (Go.length() != 0) {
            start++;
            for (int i = 0; i < Go.length(); i++) //определяем новое слово по пробелу
            {
                if (Go.charAt(i) == ' ')
                    start++;
            }
            System.out.print("Вы ввели  "+ start+ "слов");

        }




    }
}



// 3. Написать и протестировать функции работы со строками - дана строка, состоящая из слов, разделенных
    //пробелами и знаками препинания. Определить длину самого короткого слова в строке.

    //  public static void WordMin() {
    //    String str = "У Лукоморья дуб зеленый, златая цепь на дубе том.";}


//Дан массив строк. Заменить последние три символа слов, имеющих заданную длину, на символ $

   //   public String ThreeLast(String[] array, int lenght) {
   //           if (lenght<3) {System.out.print("Введите, пожалуйста, слово, состоящее не менее чем из  символов");
   //      return null;
   //           }
   //           int sub = lenght-3;
   //           for ()


   //   }



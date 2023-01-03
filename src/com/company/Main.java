package com.company;

import java.io.IOException;

public class Main {
    //assignment 1
    //public static int number = 25;
    public static int square (int number) {
        int result = number*number;
        //System.out.println("the square value of this number is " + result);//asked for number value only..how not cool
        return result;
    }

    //assignment 2 JavaRush. Learn once - use anywhere 10 раз.//Ctrl+Q - see documentation for a class or a method at the caret

    private static String TEXT = "JavaRush. Learn once - use anywhere";

    public static void PrintTextTenTimes (String text, int number) {
        //cycle 'yo'
        for (int i = 0; i < number; i++) {
            //cycle's body begins with parenthesis
            System.out.println(text);
        }
    }
        public static void print1 (String texts) {
           int count = 4;
           for (int i = 0; i < count; i++) {
               System.out.println(texts);
           }
        }
        public static double convertCelciusToFahrenhait(int celcius) {
        double TF = (9.0/5) * celcius + 32;
        return TF;
        }


    public static void main(String[] args) throws IOException {
        print1("practice what you preach");
        //System.out.println(positive_infinity);
        //System.out.println(convertCelciusToFahrenhait(36));
        /*String a = "cat";
        System.out.println("a = " + a);
        String b = "dog";
        System.out.println("b = " + b);
        String c = "fish";
        System.out.println("c = " + c);
         a = b;
        System.out.println("now 'a' is equal 'b', so 'a' is = " + a);
         b = c;
        System.out.println("now 'b' is equal 'c', so 'b' is = " + b);
        System.out.println("if 'b' is equal 'c' now, that means 'a' is also equal 'c'?? = " + a);*/


        //print1("Java is easy to learn!");
        //print1("Java is object-oriented!");
        //print1("Java is platform-independent!");
        //throws для задания №2
	// assignment 1
        /*int i = 2;
        String s = "5" + i;
        System.out.println(s); //answer is 52
        int SquareNumber = square(Main.number);*/

        //assignment  2
       //PrintTextTenTimes(TEXT, 10);
        /*String s1 = "Меня зовут Амиго.";
        String s2 = " ";
        String s3 = "В первый год работы я хочу зарплату равную $800";
        String s4 = "Во второй год работы я хочу зарплату равную $1000";
        String s5 = " ";
        String s6 = "Поцелуй мой блестящий металлический зад!";
       System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n" + s5 + "\n" + s6);*/
       //System.out.println(square(5));
       //int as = 7;
       //int bs = 0 * 3;
       //System.out.println(as + bs);


    }
}

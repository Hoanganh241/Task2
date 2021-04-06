package task3;

import java.awt.*;
import java.io.StringReader;
import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        char c1 = '0';
        char c2 = 'A';
        char c3;


        // char <-> int
        System.out.println((int) c1);
        System.out.println((int) c2);
        c3 = 97;
        System.out.println(c3);
        System.out.println((char) 97);

        //vd2
        c3 = (char) (c1 + 5);
        System.out.println(c3);
        System.out.println(c2 + 5);

        //PRINT THE CODE NUMBER FOR 'a' to 'z'
        for (int codeNum = 'a'; codeNum <= 'z'; ++codeNum) {
            System.out.println((char) codeNum + ":" + codeNum);
        }
        char c4 = '0';
        c4 += 5;
        System.out.println(c4);

        //print char '0' to '9' via increment
        for (char c = '0'; c <= '9'; ++c) {
            System.out.println(c);
        }

        // Converting a hex char (0-9|A-F|a-f) to its equivalent decimal (0-15)
        char hexChar = 'a';
        int dec;
        if (hexChar >= '0' && hexChar <= '9'){
            dec = hexChar - '0';
        }
        else if (hexChar >= 'A' && hexChar <= 'F'){
            dec = hexChar - 'A' + 10;
        }
        else  if (hexChar >= 'a' && hexChar <= 'f'){
            dec = hexChar - 'a' + 10;
        }
        else {
            dec = -1;
            System.out.println("Invalid hex char");
        }
        System.out.println(hexChar + ": " + dec);

        //String operations
        String str = "Java is cool!";
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(5));

        // Comparing teo Strings

        String anotherStr = "Java is COOL!";
        System.out.println(str.equals(anotherStr));
        System.out.println(str.equalsIgnoreCase(anotherStr));
        System.out.println(anotherStr.equals(str));
        System.out.println(anotherStr.equalsIgnoreCase(str));

        // (str == anotherStr) to compare rwo Strings is WRONG!!!

        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.substring(0, 3));
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.endsWith("cool!"));
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str.toLowerCase());

        //Converting String to Primitive

        String inStr = "5566";
        int number = Integer.parseInt(inStr);
        //Input to Integer.parseInt() must be valid integer literal
        //Number = integer.parseInt("abc");

        //String to double/float
        float aFloat = Float.parseFloat(inStr);
        double aDouble = Double.parseDouble("1.2345");
        aDouble = Double.parseDouble("1.2345");
        //aDouble to Integer.parsenInt() must be a valid double literal


        //String to char
        // Extract each char
        String msg = "hello, world";
        char msgChar;
        for (int idx = 0; idx < msg.length(); ++idx) {
            msgChar = msg.charAt(idx);
        }
            //Do something about the extracted char
        //String to boolean
            String boolStr = "true";
            boolean done = Boolean.parseBoolean(boolStr);
            boolean valid = Boolean.parseBoolean("false");

            //COnverting primitive to string
        String str1 = 123 + "";
        String str2 = 12.34 + "";
        String str3 = 'c' + "";
        String str4 = true + "";

        // Using String.valueOf(...)
        String str5 = String.valueOf(12345);
        String str6 = String.valueOf(true);
        String str7 = String.valueOf(55.66);


        //Using toString() for each primitive type
        String str8 = Integer.toString(1234);
        String str9 = Double.toString(1.23);
        String str10 = Character.toString('z');

        // Formatting String - Strign.format()
        System.out.printf("hi, %d, %.1f%n", 11, 22.22);

        String str11 = String.format("%f.1f", 1.234);

    }
}


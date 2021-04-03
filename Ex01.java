package task2;

import javax.swing.*;
import java.util.Scanner;

public class Ex01 {
    public static  void main(String[] args){
        double number1, number2, total1, total2, nettotal, points, discount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numer of Shirst to order: ");
        number1 = scanner.nextInt();
        System.out.println("Enter the number of Trouesrs to order: ");
        number2 = scanner.nextInt();

        total1 = 300 * number1;
        total2 = 700 * number2;
        discount = total1 + total2;
        nettotal = (discount - discount/10);
        points = nettotal/100;
        System.out.println("Item        Quantity     Price     Total");
        System.out.println("--------------------------------------------------------");
        System.out.println("Shirts         " + number1 + "         300      "  + total1);
        System.out.println("Trousers       " + number2 + "         700      "  + total2);
        System.out.println("Discount                            "  + discount);
        System.out.println("--------------------------------------------------------");
        if (discount > 3000){
            System.out.println("Net Total                           "  + (discount - discount/10));
        }
        else {
            System.out.println("Net Total                           "  + discount);
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("points Earned      " + points);
    }

}

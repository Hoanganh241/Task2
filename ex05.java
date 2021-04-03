package task2;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        int math ,science, english, math2 ,science2, english2, total1, total2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks obtained in Maths: ");
        math = scanner.nextInt();
        System.out.println("Enter marks obtained in Maths: ");
        science = scanner.nextInt();
        System.out.println("Enter marks obtained in Maths: ");
        english = scanner.nextInt();


        System.out.println("\n\nEnter marks obtained in Maths: ");
        math2 = scanner.nextInt();
        System.out.println("Enter marks obtained in Maths: ");
        science2 = scanner.nextInt();
        System.out.println("Enter marks obtained in Maths: ");
        english2 = scanner.nextInt();


        System.out.println("\n\nMarks of ThiDK:");
        System.out.println("Math = " + math);
        System.out.println("Science = " + science);
        System.out.println("English = " + english);


        System.out.println("\n\nMarks of Bill:");
        System.out.println("Math = " + math2);
        System.out.println("Science = " + science2);
        System.out.println("English = " + english);

        total1 = math + science + english;
        total2 = math2 + science2 + english2;
        System.out.println("\n\nTotal marks scored by ThiDK = " + total1);
        System.out.println("Percentage = " + total1/3 + "%");

        System.out.println("\n\nTotal marks scored by Bill = " + total2);
        System.out.println("Percentage = " + total2/3 + "%");

        if(total1/3 >= 90){
            System.out.println("Scholarship Amount for ThiDK = $20000");
        }
        else{
            if (total1/3 < 90 && total1/3 >= 75){
                System.out.println("Scholarship Amount for ThiDK = $10000");
            }
            else {
                System.out.println("Good luck for next time!");
            }
        }


        if(total2/3 >= 90){
            System.out.println("Scholarship Amount for Bill = $20000");
        }
        else{
            if (total2/3 < 90 && total2/3 >= 75){
                System.out.println("Scholarship Amount for Bill = $10000");
            }
            else {
                System.out.println("Good luck for next time!");
            }
        }
    }
}

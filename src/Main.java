//import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
        /*
        There are 8 primitive data tyres in Java
        1. byte
        2. short
        3. int
        4. long
        5. float
        6. double
        7. char
        8. boolean
        We tend to use int, double, and boolean the most.
         */
//        System.out.println("Lab 1a");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number1 = scanner.nextInt();
//        System.out.println("You entered: " + number1);
//
//        System.out.println("Enter a second number: ");
//        int number2 = scanner.nextInt();
//        System.out.println("You entered: " + number1 + " and " + number2);
        //Perform the basic mathematical operations of +, -, /, * and %.
        //Output the results of each operation.

        //Cut and past the code above but use doubles instead of integers.

        //If you complete this ask for the next task.
//    }
//}

import java.util.Scanner;
//I have imported the scanner to help me scan the text
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your Grade percentage");
        Scanner sc = new Scanner(System.in);
        //The scanner has been named sc
        int Grade = sc.nextInt();
        //The following 'Ifs' are diving all possible answers with their outcomes
        if (Grade >= 70 && Grade <= 100)
        {
            System.out.println("Your Grade Critera is First");
        }
        else if (Grade >= 60 && Grade < 70)
        {
            System.out.println("Your Grade Critera is 2:1");
        }
        else if (Grade >= 50 && Grade < 60)
        {
            System.out.println("Your Grade Critera is 2:2");
        }
        else if (Grade >= 40 && Grade < 50)
        {
            System.out.println("Your Grade Critera is 3rd");
        }
        else if (Grade >= 0 && Grade <40)
        {
            System.out.println("You have failed");
        }
        else if (Grade >= 100)
        {
            System.out.println("Invalid grade");
        }
        else if (Grade < 0)
        {
            System.out.println("Invalid grade");
        }
        sc.close();
        //This line closes the scanner and ends its operation
    }
}
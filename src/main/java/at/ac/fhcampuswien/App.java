package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.print(
                "0123456789012345678901" + System.lineSeparator() +
                "         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                "(__/\\__ \\--/ __" + System.lineSeparator() +
                "   \\___|----|  |   __" + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`" + System.lineSeparator());
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        int sum = 0;

        char character = 'Z';
        sum = sum + character;

        int hexadecimalform = 0xface;
        sum += hexadecimalform;

        int octalform = 012;
        sum += octalform;

        long longform = 80L;
        sum += longform;

        float floatingpointformA = 44e-1f;
        sum += floatingpointformA;

        float floatingpointformB = 5.5f;
        sum += floatingpointformB;

        double scientificnotation = 8.88e1;
        double scientificnotationtointeger = (int)scientificnotation;
        sum = (int) (sum + scientificnotationtointeger);

        double decimalfrom = 99.9;
        double decimalfromtointeger = (int)decimalfrom;
        sum += decimalfromtointeger;

        System.out.println(sum);

        // int sum = (int) (character + hexadecimalform + octalform + longformtointeger + floatingpointformA + floatingpointformB + scientificnotation + decimalfrom);

    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int sum = x+y;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = inputScanner.nextInt();
        System.out.print("y: ");
        int y = inputScanner.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = scan.nextInt();
        System.out.print("n2: ");
        int n2 = scan.nextInt();
        if(n1 > n2) {
            System.out.println("n1 > n2");
        } else if(n1 < n2) {
            System.out.println("n2 > n1");
        } else {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int annual = scan.nextInt();
        if( annual >= 0 && annual < 20000 ) {
            System.out.println("Poor Sales Revenue");
        } else if(annual >= 20000 && annual < 50000) {
            System.out.println("Average Sales Revenue");
        } else if (annual >= 50000 && annual < 80000){
            System.out.println("Good Sales Revenue");
        } else if(annual >= 80000 && annual < 100000) {
            System.out.println("Excellent Sales Revenue");
        } else {
            System.out.println("Invalid Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        System.out.print("Enter CommissionClass: ");
        Scanner scanner= new Scanner(System.in);
        int commission = scanner.nextInt();

        switch(commission) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        // If the year modulo 4 equals 0, then it's a leap year.
        // If the year % 4 = 0 and year % 100 = 0 then it's not.
        Scanner scan = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scan.nextInt();
        if(year % 4 != 0){
            System.out.println("Not a Leapyear");
        } else if(year % 100 != 0){
            System.out.println("Leapyear");
        } else if(year % 400 == 0){
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }

    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        /** https://www.programiz.com/java-programming/examples/reverse-number
         *
         */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int rev = 0; // reversed number
        int rem;   // remainder

        while(num>0){

            rem = num%10;
            rev = (rev*10) + rem;
            num = num/10;
        }
        System.out.println("Number: " + rev);


    }

    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}
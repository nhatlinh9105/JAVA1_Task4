package Task4;

import java.util.Scanner;

public class ScholarShip {
    public static void main(String[] args) {

        int thiDKMaths, thiDKScience, thiDKEnglish;
        int billMaths, billScience, billEnglish;
        String scholarShip;
        int thiDKSum = 0;
        int billSum = 0;
        int thiDKPercent = 0;
        int billPercent = 0;
       
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter marks obtained in Maths: ");
        thiDKMaths = input.nextInt();
        System.out.println("\nEnter marks obtained in Science: ");
        thiDKScience = input.nextInt();
        System.out.println("Enter marks obtained in English: ");
        thiDKEnglish = input.nextInt();

        System.out.println("\nEnter marks obtained in Maths: ");
        billMaths = input.nextInt();
        System.out.println("\nEnter marks obtained in Science: ");
        billScience = input.nextInt();
        System.out.println("Enter marks obtained in English: ");
        billEnglish = input.nextInt();

        System.out.println("\nMarks of ThiDK: ");
        System.out.println("Maths = " + thiDKMaths);
        System.out.println("Science = " + thiDKScience);
        System.out.println("English = " + thiDKEnglish);

        System.out.println("\nMarks of Bill: ");
        System.out.println("Maths = " + billMaths);
        System.out.println("Science = " + billScience);
        System.out.println("English = " + billEnglish);

        thiDKSum = thiDKEnglish + thiDKMaths + thiDKScience;
        billSum = billEnglish + billScience + billMaths;

        thiDKPercent = thiDKSum  / 3;
        billPercent = billSum / 3;

        System.out.println("\nTotal marks scored by ThiDK = " + thiDKSum);
        System.out.println("Percentage = " + thiDKPercent + "%");

        System.out.println("\nTotal marks scored by Bill = " + billSum);
        System.out.println("Percentage = " + billPercent + "%");

        System.out.println("\nIs ThiDK's percentage lesser than Bill's? ");
        System.out.println(thiDKPercent < billPercent ? "Yes" : "No");

        System.out.println("\nIs ThiDK's percentage lesser than Bill's? ");
        System.out.println(thiDKPercent > thiDKPercent ? "Yes" : "No");

        System.out.println("\nIs ThiDK's percentage lesser than Bill's? ");
        System.out.println(thiDKPercent == billPercent ? "Yes" : "No");

        if (thiDKPercent >= 75) {
            System.out.println("Scholar Amount of ThiDK = $2000");
        } else if(thiDKPercent >= 60) {
            System.out.println("Scholar Amount of ThiDK = 1000$");
        } else { 
            scholarShip = "None";
        }

        if (billPercent >= 75) {
            System.out.println("Scholar Amount of Bill = $2000");
        } else if(billPercent >= 60) {
            System.out.println("Scholar Amount of Bill = 1000$");
        } else { 
            scholarShip = "None";
        }

        
        
    }
}


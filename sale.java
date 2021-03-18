package Task4;

import java.util.Scanner;
public class sale {
    public static void main(String[] args) {
        int orderedShirt, orderedTrousers, point = 0;
        int priceOfShirt = 150;
        int priceOfTrouser = 500;
        int cosOfShirt, costOfTrousers, totalCost;
        int discount;
        double netPay;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Shirt to order: ");
        orderedShirt = input.nextInt();
        System.out.println("Enter the num ber of Trousers yo order: ");
        orderedTrousers = input.nextInt();

        cosOfShirt = priceOfShirt * orderedShirt;
        costOfTrousers = priceOfTrouser * orderedTrousers;
        totalCost = costOfTrousers + cosOfShirt;

        discount = totalCost >3000 ? totalCost * 5 / 100 : 0;
        discount = totalCost > 5000 ? totalCost *10 /100 :totalCost * 5 /100 ;
        netPay = totalCost - discount;

        point = (int) (netPay > 3000 ? netPay / 100:0);

        System.out.println("\nItem \t\t Quantity \t Price \t Total");
        System.out.println("----------------------------------------------" +
                "--------------------------");
        System.out.printf("Shirt \t\t %d \t\t %d\t\t %d\n",orderedShirt,priceOfShirt,cosOfShirt);
        System.out.printf("Trousers \t %d \t\t %d\t\t %d\n", orderedTrousers,priceOfTrouser,costOfTrousers);
        System.out.printf("Discount \t \t\t \t\t\t\t %d\n",discount);
        System.out.println("----------------------------------------------" +
                "--------------------------");
        System.out.printf("Net total \t \t\t \t\t\t\t %.2f \n",netPay);
        System.out.println("----------------------------------------------" +
                "--------------------------");
        System.out.printf("Points Earned \t %d\n",point);
        System.out.println("Thank you!\n");
    }
}

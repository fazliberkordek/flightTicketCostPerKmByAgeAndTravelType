import java.util.Scanner;

/**
 * @author fazliberkordek  5 April 2023
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distance, age, travelType;
        double priceForKm = 0.10, discount;

        System.out.print("Please enter the distance by km :");
        distance = input.nextInt();

        System.out.print("Please enter the age :");
        age = input.nextInt();

        System.out.println("Select the flight type : \n1-) One way \n2-) Multi Way. ");
        travelType = input.nextInt();
        //Task 1: Total cost of the fly:

        double totalCostPerKm = distance * priceForKm;
        //todo:  Age,distance and travel type conditions must have satisfied

        if (age > 0 && distance > 0 && (travelType == 1 || travelType == 2)) {
            System.out.println("Total cost without discount: " + totalCostPerKm);
            if (age < 12) {
                totalCostPerKm = totalCostPerKm - totalCostPerKm * 0.50;
                //if age is 12 and travel type is multiway:;
                if (travelType == 2) {
                    totalCostPerKm = totalCostPerKm - totalCostPerKm * 0.20;
                }
                System.out.println(2 * totalCostPerKm);
            } else if (age > 12 && age < 24) {
                totalCostPerKm = totalCostPerKm - totalCostPerKm * 0.10;

                if (travelType == 2) {
                    totalCostPerKm = totalCostPerKm - totalCostPerKm * 0.20;
                }
                System.out.println(2 * totalCostPerKm);
            } else if (age > 65) {
                totalCostPerKm = totalCostPerKm - totalCostPerKm * 0.30;

                if (travelType == 2) {
                    totalCostPerKm = totalCostPerKm - totalCostPerKm * 0.20;
                }
                System.out.println(2 * totalCostPerKm);
            } else {
                if (travelType == 2) {
                    totalCostPerKm = totalCostPerKm - totalCostPerKm * 0.20;
                    System.out.println(2 * totalCostPerKm);
                }
            }

        } else {
            System.out.println("Wrong age,distance and travel type selected!");

        }


    }
}
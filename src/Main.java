import java.util.Scanner;

public class Main
{
        public static void main(String[] args)
        {
	    Scanner in = new Scanner(System.in);
        String trash = "";
        double gasTank = 0;
        double fuelEff = 0;
        double gasPrice = 0;
        double carDistance;
        double hundredCost;

        System.out.print("Please enter the number of gallons of gas that are in the tank: ");
                if(in.hasNextDouble())
                {
                        gasTank = in.nextDouble();
                        in.nextLine();

                        System.out.println("Number of gallons is: " + gasTank);
                }
                else
                {
                        trash = in.nextLine();
                        System.out.println("Illegal number: " + trash);
                        System.out.println("Exiting...run the program again!");
                        System.exit(0);
                }
        System.out.print("Please enter the fuel efficiency in miles per gallon: ");
                if(in.hasNextDouble())
                {
                        fuelEff = in.nextDouble();
                        in.nextLine();

                        System.out.println("The fuel efficiency is: " + fuelEff);
                }
                else
                {
                        trash = in.nextLine();
                        System.out.println("Illegal number: " + trash);
                        System.out.println("Exiting...run the program again!");
                        System.exit(0);
                }
        System.out.print("Please enter the price of gas per gallon: ");
                if(in.hasNextDouble())
                {
                        gasPrice = in.nextDouble();
                        in.nextLine();

                        System.out.println("The gas price is: " + gasPrice);
                }
                else
                {
                        trash = in.nextLine();
                        System.out.println("Illegal number: " + trash);
                        System.out.println("Exiting...run the program again!");
                        System.exit(0);
                }

        carDistance = gasTank * fuelEff;
        hundredCost = (gasPrice * 100) / fuelEff;
                System.out.println("The cost per 100 miles is: " + hundredCost + " and the car is able to go " + carDistance + " miles with the gas left in the tank.");
        }
}

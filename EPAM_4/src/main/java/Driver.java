import Back_Logic.Construction;
import Back_Logic.Interest;

import java.util.Scanner;

public class Driver {
    private static void Input(Interest cal,Construction cost){
        boolean b = true;
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("\nEnter \n1 to calculate interest \n2 to calculate cost\nAny other key to Exit");
            choice = scan.nextInt();
            switch (choice){
                case (1):{
                    System.out.println("Enter \n1 to calculate Simple Interest \n2 to calculate Compound Interest ");
                    switch (scan.nextInt()){
                        case(1):{
                            System.out.println("\nEnter Principal , Rate and Time in years ");
                            float intres = cal.calculateSimpleInterest(scan.nextDouble(),scan.nextDouble(),scan.nextDouble());
                            System.out.println("\nSI is  " + intres +" $");
                            break;
                        }
                        case(2):{
                            System.out.println("\nEnter Principal , Rate and Time in years ");
                            float intres = cal.calculateCompoundInterest(scan.nextDouble(),scan.nextDouble(),scan.nextDouble());
                            System.out.println("\nSI is  " + intres +" $");
                            break;

                        }
                        default:{
                            System.out.println("Invalid");
                            Input(cal,cost);
                        }
                    }
                break;
                }
                case (2):{
                    int area;
                    float price;
                    System.out.println("Enter Area of House to be Renovated in sqFeet");
                    area = scan.nextInt();
                    System.out.println("Choose the cost of Renovation " +
                            "\n1 - 1200 INR for standard material " +
                            "\n2 - 1500 INR for above standard materials " +
                            "\n3 - 1800 INR for HighStandard Material " +
                            "\n4 - 2500 INR for HighStandard Material and fully Automated");
                    price = cost.compute(area,scan.nextInt());
                    if (price == 0) {
                        Input(cal, cost);
                    } else {
                        System.out.println("The cost of Renovating is INR " + price);
                    }

                    break;
                }
                default: {
                   System.exit(1);
                };
            }

        }while(true);
    }
    public static void main(String[] args) {
        Interest calc = new Interest();
        Construction cost = new Construction();
        Input(calc,cost);

    }
}

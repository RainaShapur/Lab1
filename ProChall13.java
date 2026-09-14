import java.util.Scanner;


public class ProChall13{
    public static void main (String[] args){
        ////constants
        final double TAX_RATE = 0.0675; // 6.75%
        final double TIP_RATE = 0.20;   // 20%

        ////variables
        double mealCharge, tax, tip, total;

        ////get input for meal charge using a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter meal amount: $");
        mealCharge = input.nextDouble();

        ////computations
        tax = mealCharge * TAX_RATE;
        tip = mealCharge * TIP_RATE;
        total = mealCharge + tax + tip;

        ////display output
        System.out.printf("The tax is: $%,.2f\nThe tip is: $%,.2f\nThe meal cost with tax and tip is: $%,.2f", tax, tip, total);
    }//// end main()
}//// end class
import java.util.Scanner;


public class ImprecisionPt2
{
    public static void main (String[] args){
        ////variables
        double pricePerShare, totalCostShares, commission, total;
        final double COMM_RATE = 0.02; // 2% commission

        ////get input for number of shares and cost per share using a Scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of shares purchased: ");
        int numShares = input.nextInt();

        System.out.print("Enter the price per share: $");
        pricePerShare = input.nextDouble();

        ////computations
        totalCostShares = numShares * pricePerShare;      // shares * price per share
        commission = totalCostShares * COMM_RATE;          // totalCostShares * commission rate
        total = totalCostShares + commission;               // totalCostShares + commission

        ////display output
        System.out.printf("Total cost of shares are: $%,.2f\nCommission cost is: $%,.2f\nTotal Cost is: $%,.2f",totalCostShares, commission, total);
    }//// end main()
}//// end class
import java.util.Scanner;

public class Sorting
{
    public static void main (String[] args){
        //int vars for each number and for low, med, high
        int n1, n2, n3;
        int low, med, high;

        Scanner keyboard = new Scanner(System.in);

        //input message and collect the 3 numbers to be sorted
        System.out.print("Enter three numbers separated by spaces: ");
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        n3 = keyboard.nextInt();

        ////Look for when n1 is smallest section
        if ((n1 <= n2) && (n1 <= n3)){
            low = n1;
            //figure out if n2 is smaller or equal to n3
            if (n2 <= n3){
                med = n2;
                high = n3;
            }
            else{
                med = n3;
                high = n2;
            }
        }

        ////n1 is not the smallest, now figure out when n2 is smallest
        else if (n2 <= n3){ //n2 is smallest
            low = n2;
            //figure out if n1 is smaller or equal to n3
            if (n1 <= n3){
                med = n1;
                high = n3;
            }
            else{
                med = n3;
                high = n1;
            }
        }

        ////n1 and n2 are not the smallest, so by default n3 is the smallest
        else { //n3 is smallest
            low = n3;
            //figure out if n1 is smaller or equal to n2
            if (n1 <= n2){
                med = n1;
                high = n2;
            }
            else{
                med = n2;
                high = n1;
            }
        }

        System.out.println("The inputs sorted smallest to largest are: " + low + " " + med + " " + high);
    }
}

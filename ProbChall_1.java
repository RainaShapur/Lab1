import java.util.Scanner;

public class ProbChall_1 {
    public static void main (String[] args){
        //int used for the switch
        int number;

        //Scanner object tied to the keyboard
        Scanner keyboard = new Scanner(System.in);

        //Ask the user for a number and store it
        System.out.print("Enter a number between 1 and 3: ");
        number = keyboard.nextInt();

        switch(number){
            case 1:
                System.out.println(number + " converted to a Roman Numeral is I");
                break; //without break we would bleed through to the other cases
            case 2:
                System.out.println(number + " converted to a Roman Numeral is II");
                break;
            case 3:
                System.out.println(number + " converted to a Roman Numeral is III");
                break;
            default: //catch all for anything that is not 1, 2, or 3
                System.out.println(number + " was not a valid number, must be btw 1->3");
                break; //not needed here since default is last, but it is proper style
        }
    }
}
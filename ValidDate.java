import java.util.Scanner;

public class ValidDate {
    public static void main (String[] args){
        //int vars for month, day, year
        int month, day, year;
        //String vars for temp, output
        String temp, output;
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter("/"); //changes the default delimiter to "/"

        output = ""; //blank output, filled in with the reason if the date is not valid
        System.out.print("Enter a date in mm/dd/yyyy format: ");
        month = keyboard.nextInt();
        day = keyboard.nextInt();
        temp = keyboard.nextLine().substring(1).trim();  //ie, assigns "2022" to temp, if /2022 is in the buffer!
        year = Integer.parseInt(temp);

        boolean isValid = false;

        ////Section 1, day is less than 1
        if (day < 1)
            output = "Cannot have less than 1 day in a month.";

        ////Section 2, day is larger than 31
        else if (day > 31)
            output = "Cannot have more than 31 days in any month.";

        ////Section 3, btw 1 and 31 days, a switch on the month with intentional bleed through
        else{
            switch(month){
                ////Cases for all 31 day months
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    isValid = true;
                    break; //prevent bleed through

                ////Cases for all 30 day months
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day <= 30)
                        isValid = true;
                    else
                        output = "Cannot have 31 days in this month.";
                    break; //prevent bleed through

                ////This is February
                case 2:
                    boolean isLeapYear = false;
                    //divisible by 400, OR divisible by 4 and NOT divisible by 100
                    if (year % 400 == 0 || (year % 4 == 0 && !(year % 100 == 0)))
                        isLeapYear = true;

                    if (isLeapYear){
                        if (day <= 29)
                            isValid = true;
                        else
                            output = "Cannot have 30 or more days in a leap year.";
                    }
                    else{ ////non-leap year
                        if (day <= 28)
                            isValid = true;
                        else
                            output = "Cannot have 29 or more days in a non-leap year.";
                    }
                    break; //prevent bleed through
                    ////end case 2

                //Default case if month is not between 1 and 12
                default:
                    output = "Months must be 1 to 12.";
            }////End of switch
        }////End of else section for multibranch if-else if

       
        if (isValid)
            System.out.println(month + "/" + day + "/" + year + " is a valid date.");
        else
            System.out.println(month + "/" + day + "/" + year + " is not a valid date. " + output);
    }
}
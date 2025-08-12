import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Switch_Day_Print {
    public static void main(String[] args) {
        int Day = 0;
        //String dayString;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The Day Number : ");
        Day = sc.nextInt();
       // dayString = sc.next();
        switch(Day)
        {
            case 1:
            //dayString = "Monday";
             System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday"); 
            break;

            case 3:
            System.out.println("Wednesday"); 
            break;

            case 4:
            System.out.println("Thursday"); 
            break;

            case 5:
            System.out.println("Friday"); 
            break;

            case 6:
            System.out.println("Saturday");
            break;

            case 7:
            System.out.println("Sunday");
            break;
            
            default:
            System.out.println("Invalid Day");
            break;
        }
        
    }
    
}

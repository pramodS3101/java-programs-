/* Write a program to check whether a given year is a leap year.*///if( Year < 1000 || Year > 9999){INVALID} else if(Year % 4 == 0) {LEAP}*/
import java.util.*;

public class Checking_The_Leaf_year_program {
    public static void main(String[] args) {
        int Year = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("\n Enter The Year :"+ Year);
        Year = sc.nextInt();
        if((Year < 1000) || (Year > 9999)){
            System.out.println("\n Number Of Year Is Not Valid ");
        }
        else if(Year % 4 == 0){
            System.out.println("\n The Year Is Leaf :"+ Year);
        }
        else{
            System.out.println("\n The year Is Not A Leaf Year :"+ Year);
        }
    }    
}

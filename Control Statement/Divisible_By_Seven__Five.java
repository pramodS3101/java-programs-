//Write a program to accept a number from the user and check whether it is divisible by 5 and 7 or not.
import java.lang.*;
import java.util.*;

public class Divisible_By_Seven__Five {
    public static void main(String[] args) {
        int  N1 = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("\n Enter The First Number");
        N1 = sc.nextInt();

        if(N1 == 0){
            System.out.println("\n The Value Is Not Valid They Are Not Divisible By Five Are Seven");
        }
        else if((N1 % 5 == 0) && (N1 % 7 == 0)){
            System.out.println("\n The Number Is Divisible By Both Five And Seven :"+ N1);
        }
        else if(N1 % 5 == 0){
            System.out.println("The Number Is Divisible By Only Five :"+ N1);
        }
        else if(N1 % 7 == 0){
            System.out.println("\n The Number Is Divisible By Only Seven :"+ N1);
        }
        else{
            System.out.println("The Number Not Divisible By Five Or Seven :"+N1);
        }
    }
    
}

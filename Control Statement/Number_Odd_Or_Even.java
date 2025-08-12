
import java.lang.*;
import java.util.*;

public class Number_Odd_Or_Even {
    public static void main(String[] args) {
        
        int N1 = 0;
        
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter The Number:");
        N1 = sc.nextInt();

        if(N1 % 2 == 0){
            System.out.println("The Number Is Even:"+ N1);
        }
        else{
            System.out.println("The Number Is Odd:"+ N1);
        }


    }
    
}

import java.lang.*;
import java.util.*;

public class Check_the_Number_Positive_Negative {
    public static void main(String[] args) {
        double N2 = 0;

        Scanner sc = new Scanner (System.in);
        System.out.println("\n Enter The Number :"+N2);
        N2 =sc.nextInt();
        

        if(N2 == 0){
            System.out.println("\n The Number Is Invalid"+ N2);
        }
        else if(N2 > 0){
            System.out.println("\n The Number Is Positve :"+ N2);
        }  
        else{
            System.out.println("\n The Number Is Negative : "+ N2);
        }
        
        
    }

    
}

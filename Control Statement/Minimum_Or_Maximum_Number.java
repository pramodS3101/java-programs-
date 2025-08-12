import java.lang.*;
import java.util.*;

public class Minimum_Or_Maximum_Number {
    public static void main(String[] args) {
        int N1 = 0,  N2 = 0;
        Scanner sc =new Scanner (System.in);

        System.out.println("\n Enter The First Number :"+N1);
        N1 = sc.nextInt();
        System.out.println("\n Enter The Second Number :"+N2);
        N2 = sc.nextInt();
        
        if(N1 == N2){
            System.out.println("\n The Both Two Number Are Equal ");
        }
        else if(N1>N2){
            System.out.println("\n The Number First is:"+N1 +" Maximum As Compare To The Number Second :"+N2);
        }
        else{
            System.out.println("\n The Number Second is:"+N2 +" Maximum As Compare To The Number First :"+N1);
        }


    }
    
}

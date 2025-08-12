import java.lang.*;
import java.util.*;
public class Neutral_Odd_Or_Even {
    public static void main(String[] args) {
        int N1 = 0;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The First Number:");
        N1 = sc.nextInt();

        if(N1 == 0){
            System.out.println("The Number Is Invalid : "+N1);
        }
        else if(N1 % 2 == 0){
            System.out.println("The Number Is Odd:"+ N1);
        }
        else{
            System.out.println("The Number Is odd:"+ N1);
        }
    }
    
}

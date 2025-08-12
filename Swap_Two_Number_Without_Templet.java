import java.lang.*;
import java.util.*;

public class Swap_Two_Number_Without_Templet {
    public static void main(String[] args) {
    
        int N1 = 0, N2 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First number :" + N1);
        N1 = sc.nextInt();
        System.out.println("Enter The First number :" + N2);
        N2 = sc.nextInt();

        N1 = N1 + N2; //N1 + N2 = 15 + 45 = N1=60
        N2 = N1 - N2; //N2 = N1-N2 = 60 - 45 = N2=15
        N1 = N1 - N2; //N1 = N1-N2 = 60-15 = N1=45

        System.out.println("After Swapping :");
        System.out.println("Enter The First Number :" + N1);
        System.out.println("Enter The First Number :" + N2);
        
    }

    
}

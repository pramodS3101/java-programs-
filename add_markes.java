import java.lang.*;
import java.util.*;

public class add_markes{
    public static void main(String[] args) {
        int phy = 0, chem = 0, mathes = 0, total = 0;
        float per = 0.0f;

        Scanner sc = new Scanner (System.in);
        System.out.println("\n Enter the Physices Markes     : "+ phy);
        phy = sc.nextInt();
        System.out.println("\n Enter the Mathematices Markes : "+ mathes);
        mathes = sc.nextInt();
        System.out.println("\nEnter the Chemistry Markes     :" + chem);
        chem = sc.nextInt();

        total = phy + mathes + chem ;
        System.out.println("\nTotal Markes :"+ total);
        
        per = (float)total/3;  
        System.out.println("Persentage of Student : "+ per + " %");
        

    }
}
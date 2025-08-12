import java.util.Scanner;
public class Write_Table_Useing_While {
    public static void main(String[] args) {
        int No = 0, i = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number");
        No = sc.nextInt();
        System.out.println("\n Table Number Is :"+No);
        i = 1;
        while(i <= 10){
            System.out.println( No +" * "+ i  + " = " + (No * i));
            i++;
        }

        
    }
    
}

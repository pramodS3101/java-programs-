import java.util.Scanner;

public class Addition_Two_Number {
    public static void main(String[] args) {
        
        int N1 = 0, N2 = 0, Sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter The First Number :" + N1);
        N1 = sc.nextInt();
        System.out.println("\n Enter The First Number :" + N2);
        N2 = sc.nextInt();
        Sum = N1 + N2;
        System.out.println("\n Total Of Two Number :" + Sum);
        
    }
    
}

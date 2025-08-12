import java.util.Scanner;

public class Swap_To_number {
    public static void main(String[] args) {
        int N1 = 0, N2 = 0, Templet = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter The First Number :" + N1);
        N1 = sc.nextInt();
        System.out.println("\n Enter The First Number :" + N2);
        N2 = sc.nextInt();

        Templet = N1;
        N1 = N2;
        N2 = Templet;

        System.out.println("\n After Swapping=> ");
        System.out.println("\t first Number  =" + N1);
        System.out.println("\t Second Number =" + N2);




    }
    
}

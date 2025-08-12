import java.util.Scanner;
public class The_Number_Is_Divisible_By_Seven{
    public static void main(String[] args) {
        int N1 = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("\n Enter The First Number :");
        N1 = sc.nextInt();
        if(N1 == 0){
            System.out.println("\n The Zero Is Not Divisible By Seven");
        }
        else if(N1 % 7 == 0 ) {
            System.out.println("\n The Number Is Divisible By Seven: " +N1);
        }
        else{
            System.out.println("\n The Number Is Not Divisible By Seven: " +N1);
        }
    }
}

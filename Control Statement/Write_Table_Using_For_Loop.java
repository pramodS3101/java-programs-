import java.util.Scanner;

public class Write_Table_Using_For_Loop {
    public static void main(String[] args) {
        int No = 0, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        No = sc.nextInt();
        System.out.println("Enter The Table Number Is :"+ No);
        for(i = 1; i <= 10; i++ ){
            System.out.println(No + "*" + i + "=" +(No * i));
        }

    }
    
}
 
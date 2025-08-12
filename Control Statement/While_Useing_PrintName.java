import java.util.Scanner;

public class While_Useing_PrintName {
    public static void main(String[] args) {
        int Cnt = 0;
        String Name = "";
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The Count :");
        Cnt = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter The Name :");
        Name = sc.nextLine();
        
        while(Cnt > 0){
            System.out.println("Enter The Name : "+Name);
            Cnt--;
        }

     
        
    }
    
}

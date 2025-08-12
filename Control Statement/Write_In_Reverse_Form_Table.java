import java.util.Scanner;
public class Write_In_Reverse_Form_Table {
    public static void main(String[] args) {
        int No = 0, i = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :"+No);
        No = sc.nextInt();
        
        System.out.println("Reverse TheTable Number :"+No);
        for(i=10; i >=1 ; i--){
            System.out.println(No +" * "+ i +" = "+(No * i) );
        }

        
    }
    
}

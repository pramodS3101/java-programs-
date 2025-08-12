import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // factorial
        //5 = 5*4 = 20;
        //    20*3 = 60;
        //    60*2 = 120;
        //    120*1 = 120;
        //    fact = fact*No 
        int Fact = 0,Temp = 0, No = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number "+ No);
        No = sc.nextInt();
        if(No <= 0){
        System.out.println("\nInvalid Input.");
        return;
        }
        for(Temp = No, Fact = 1; Temp > 0; Temp-- ){

        Fact = Fact * Temp;
        //System.out.println("Factorial of is :" +No+"*"+Fact+"!="+Fact );

        }
        System.out.println("Factorial of is :" +No+"! is "+" = "+Fact );
         
        
    }
    
}

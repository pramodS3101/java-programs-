import java.util.Scanner;
public class Star_Print_Given_By_Count {
    public static void main(String [] args){
    int Cnt = 0,
    String = 'a';
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Number :");
    Cnt = sc.nextInt();
    
    while(Cnt > 0){
       System.out.println("*"); 
        Cnt--;
    }

    }
}

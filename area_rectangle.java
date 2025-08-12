import java.util.Scanner;

public class area_rectangle {
    public static void main(String[] args) {
        float Lenght = 0.0f, 
        Breadth = 0.0f,
        Area = 0.0f; 

        Scanner sc = new Scanner (System.in);
        System.out.println("Lenght Of Rectangle :" + Lenght);
        Lenght = sc.nextFloat();
        System.out.println("Breadth Of Rectangle :" + Breadth);
        Breadth = sc.nextFloat();

        Area = Lenght * Breadth;
        System.out.println("Area Of Rectangle :"+ Area);


        

    }
    
}

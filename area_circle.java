import java.util.Scanner;

public class area_circle {
    public static void main(String[] args) {
        float Radius = 0.0f;
        final float PI = 3.14f;
        float Area = 0.0f;

        Scanner sc = new Scanner (System.in);
        System.out.println("Distance of Radius :" + Radius );
        Radius = sc.nextFloat();
        
        Area = PI * Radius * Radius;
        System.out.println("Area Of Circle:"+ Area);

        
        

    }
    
}

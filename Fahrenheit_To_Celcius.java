import java.lang.*;
import java.util.*;

public class Fahrenheit_To_Celcius{
    public static void main(String[] args) {
        float Fht = 0.0f, Cel = 0.0f;

        Scanner sc = new Scanner(System.in);
        System.out.println( "\nTemperature in Fahrenheit"+ Fht );
        Fht = sc.nextFloat();

        Cel = (Fht - 32) * (0.5f/0.9f);
        System.out.println("\n Temperature In Celceius :"+ Cel );
        

        
    }
}

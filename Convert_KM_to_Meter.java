import java.lang.*;
import java.util.*;
public class Convert_KM_to_Meter{
    public static void main (String [] args){
        float KM = 0.0f;
        float Meter = 0.0f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Distance In Kilometer =>" + KM +"km");
        KM = sc.nextFloat();
        Meter = KM * 1000;
        System.out.println("Distance In Meter"+ Meter + "MM");
    }
}
//Write a program that accepts a day number (1 to 7) and prints the corresponding day of the week

import java.util.*;

public class Number_wise_day {
    public static void main(String[] args) {
        int Day = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Day Number :"+Day);
        Day = sc.nextInt();
        if((Day <= 0) || (Day > 7)) {
            System.out.println("\nThe value is Not valid Or The Negative Or Maximum To Seven Value is Not Accpeted:");
            
        }
        else if(Day == 1){
            System.out.println("\nThe Day Number Is One :"+ 1 +" Sunday" );
        }
        else if(Day == 2){
            System.out.println("\nThe Day Number Is One :"+ 2 +"Monday " );
        }
        else if(Day == 3){
            System.out.println("\nThe Day Number Is One :"+ 3 +"Tuesday " );
        }
        else if(Day == 4){
            System.out.println("\nThe Day Number Is One :"+ 4 +"Wednesday " );
        }
        else if(Day == 5){
            System.out.println("\nThe Day Number Is One :"+ 5 +"Thursday " );
        }
        else if(Day == 6){
            System.out.println("\nThe Day Number Is One :"+ 6 +" Friday" );
        }
        else if(Day == 7){
            System.out.println("\nThe Day Number Is One :"+ 7 +" Saturday" );
        }
        
        }
    }
    


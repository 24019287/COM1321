import java.util.Scanner;

public class compound {

   public static void main(String[] args){
    
Scanner scann = new Scanner(System.in);

double A;
double P;
double I;
double N;

System.out.println("enter your intial amount");
P = scann.nextDouble();
System.out.println("enter your Rate in percentage");
I = scann.nextDouble();
I =I/100;
System.out.println("enter your period in months");
N = scann.nextDouble();

A = P * Math.pow(1 + I,N);

System.out.println("enter your final amount is :" + A);


   } 
}
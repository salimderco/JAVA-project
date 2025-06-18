import java.util.Scanner;
public class tp03 {
public static void main (String [] args ){
Scanner scanf =new Scanner (System.in);
double cels;
System.out.println ("enter the cels please ::\n ");
cels =scanf.nextDouble();

Double fah=cels * (9/5 )+32 ;
System.out.println ("the result in fahnanrite::\n" +fah);
scanf.close();
}}

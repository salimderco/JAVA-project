import java.util.Scanner;
public class tp12{
public static void main (String [] args ){
Scanner scanf =new Scanner (System.in);
product p1 =new product ("cher" ,500);
product p2 =new product ("mobil" , 24452);
product p3 =new product ("pc" , 24412);
p1.display();
p2.display();
p3.display();

System.out.println ("enter the new price of the 1 product @ ::\n");
double newprice  = scanf.nextDouble ();
p1.modiffy (newprice) ;
System.out.println ("enter the new price of the 2 product @::\n");
double newprice1  = scanf.nextDouble ();
p2.modiffy1 (newprice1) ;
System.out.println ("enter the new price of the 3 product  @ ::\n");
double newprice2  = scanf.nextDouble ();
p3.modiffy2 (newprice2) ;
p1.display();
p2.display();
p3.display();
}}
import java.util.Scanner;
public class tp11{
public static void main (String [] args ){
Scanner scanf =new Scanner (System.in);
house h1 =new house ("sidi emparke" ,5);
house h2 =new house ("bordj bou arreridj" , 2);
h1.display();
h2.display();
System.out.println ("give the new nom of roms in the first @ ::\n");
int newnumofroms  = scanf.nextInt ();
h1.modiffy (newnumofroms) ;

System.out.println ("give the new nom of roms in the second @ ::\n");
int newnumofroms1  = scanf.nextInt ();
h2.modiffy (newnumofroms1) ;
h1.display();
h2.display();
}}
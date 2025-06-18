import java.util.Scanner;
public class tp06{
public static void main (String [] args ){
Scanner scanf =new Scanner (System.in);

System.out.println ("enter the price please ::");
int price=scanf.nextInt();
price =(price*120) /100;
if (price>=2000){
price=(price*85)/100;
System.out.println ("the price after the disacout is ::"+price);
} 
else {
System.out.println ("there is no discount  ::"+price);}
scanf.close();
}}












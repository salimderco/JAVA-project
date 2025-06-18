import java.util.Scanner;
public class tp10{
public static void main (String [] args ){
Scanner scanf =new Scanner (System.in);
student stud1 = new student ("salim" ,20);
int newgrade ;
stud1.display();
System.out.println ("enter the new grade::");
newgrade =scanf.nextInt();
stud1.udabtgrade (newgrade);
stud1.display();
}}
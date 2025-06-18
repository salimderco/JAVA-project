import java.util.Scanner ;
public class rev01 {

public static void main (String [] args){
Scanner scanf =new Scanner (System.in);

person p =new person () ;


p.setter (111 ,"derradj");
int newage  =p.getter() ;
String newname =p.getter1() ;
System.out.println ("youe age is :: "+newage+" your name is  :: "+newname );

p.display();
human h =new human(15 ,"sall",200);
h.display();
}}

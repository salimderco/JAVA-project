import java.util.Scanner ;

public class tp04 {

public static void main (String [] args ){

Scanner scanf =new Scanner (System.in);

System.out.println ("enter the first value a :");
int a =scanf.nextInt();
System.out.println ("enter the second value b :");
int b =scanf.nextInt();

if (a<b){
System.out.println ("the smallest num betwine -a- and -b- is -a-::\n" +a);
}
else 
{
System.out.println ("the smallest num betwine -a- and -b- is -b-::\n" +b);
}
scanf.close();
}}
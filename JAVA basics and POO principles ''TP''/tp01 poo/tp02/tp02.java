import java.util.Scanner ;
public class tp02 {
public static void main (String [] args){

Scanner scanf =new Scanner(System.in);
int s;

System.out.println ("please give the first value ::");
int a= scanf.nextInt();

System.out.println ("please give the second value ::");
int b= scanf.nextInt();

s=a+b;

System.out.println ("the result is ::"+s);
a=(b+5);
a=(b+s)+2;
boolean n;
n=(a==b);
n=(a<b)&&(b<s);
System.out.println ("the result ::" +n+   "\nthe a is ::\n" +a );
scanf.close();
}}




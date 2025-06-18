import java.util.Scanner ;
public class tp05{

public static void main (String [] args ){
Scanner scanf =new Scanner (System.in);

System.out.println ("enter n :: ");

int n= scanf.nextInt();
int s=n;
for (int i=1 ;i<n;i++){
s=s*i;
}
System.out.println ("the result is :: "+s);
scanf.close ();
}}
import java.util.Scanner ;
public class tp07{

public static void main (String [] args ){
Scanner scanf =new Scanner (System.in);
int c;
int i=1;
int s=0;
System.out.println ("enter n :: ");
int n= scanf.nextInt();
while(i<=n){
s=s+i;
i++;
}
System.out.println ("the sum is :: \n"+s);
scanf.close ();
}}
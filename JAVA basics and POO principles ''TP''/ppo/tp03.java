import java.util.Scanner;
public class tp03  {
public static void main (String []args ){ 
int t [] =new int [5] ;
int i;
Scanner scanf =new Scanner(System.in);
for ( i =0 ; i<5;i++){
System.out.println ("enter the value of the array ::"+i );
t[i] =scanf.nextInt ();
}

for ( i =0 ; i<5;i++){
if (t[i]%2 ==0){
System.out.println ("this value of t ["+i+"] is even" );
}
else {
System.out.println ("this value of t ["+i+"] is odd" );}
}

scanf.close ();
}}
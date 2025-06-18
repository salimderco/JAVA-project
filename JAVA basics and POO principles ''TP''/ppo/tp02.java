import java.util.Scanner;
public class tp02  {
public static void main (String []args ){
int min =t[0]; 
int t [] =new int [5] ;
int i;
Scanner scanf =new Scanner(System.in);
for ( i =0 ; i<5;i++){
System.out.println ("enter the value of the array ::"+i );
t[i] =scanf.nextInt ();
}


for ( i =0 ; i<5;i++){
if (t[i]>t[i+1]){
min =t[i+1];
}}

System.out.println ("the min of the array is ::" +min );

scanf.close ();
}}
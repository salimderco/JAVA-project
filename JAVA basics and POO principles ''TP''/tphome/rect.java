
import java.util.Scanner ;
public class rect {
public static void main (String [] args ){
Scanner scanf =new Scanner(System.in);
rectangle r1=new rectangle ();
System.out.println ("enter the l ");
double leng =scanf.nextDouble();
System.out.println ("enter the w");
double widt =scanf.nextDouble();
 double t = r1.setlen (widt ,leng);
System.out.println ("the area is " +t);

}}

class rectangle{
public double len;
public double wid;
public double area;
public double  setlen (double leng  ,double widt ){
len =leng ;
wid =widt;
double area =len*wid;
return area;
}

}
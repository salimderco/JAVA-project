import java.util.Scanner ;
public class rev {
public static void main (String []args ){
Scanner scanf =new Scanner (System.in);
double e ;
System.out.println ("enter the len ::") ;
double l =scanf.nextDouble();
System.out.println ("enter the wid ::") ;
double w =scanf.nextDouble();
rec r1 =new rec ();
r1.setlen (l);
r1.setwid (w);
r1.getlen ();
r1.getwid ();
System.out.println ("this the len::\n"+r1.getlen ()) ;
System.out.println ("this the wid::\n"+r1.getwid ()) ;
r1.afficher() ;
e=r1.erea(l,w) ;
System.out.println ("this the erea::\n"+e) ;

}}
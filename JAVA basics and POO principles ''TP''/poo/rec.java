public class rec {
double len;
double wid ;

//constractor
public rec (double newlen ,double newwid ){
this.len  =newlen;
this.wid =newwid;}
public rec (){
this.len  =len;
this.wid =wid;
//setter
}
//setter

public void  setlen (double l){

len = l ;
}
public void setwid (double w){
wid = w ;
}
//getter
public double  getwid (){
return  wid ;
}
public double getlen (){
return  len ;
}
//functions or methods 
public void afficher (){
System.out.println ("this is the len:: "+len );
System.out.println ("this is the wid:: "+wid );
}

public double erea (double len ,double wid){
double erea ;
erea =len*wid ;
return erea ;
}}


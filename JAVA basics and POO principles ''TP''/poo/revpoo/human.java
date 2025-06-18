public class human extends person {
int salary ;
public human ( int age,String name ,int salary){
super (age ,name ); 
this.salary =salary ;}
public void setter (int salary){
this.salary =salary ;}
public int getter (){
return this.salary ;

}
@override
public void display (){
super.display();
System.out.println ("the salary is ::" +salary);}
}
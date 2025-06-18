public class person {
int age ;
String name ;

public person (int age ,String name ){
this.age =age ;
this.name =name;

}
public person (int age  ){
this.age =age ;
}
public person (String name ){
this.name =name;
}
public person (){
}
public  void setter (int newage  ,String newname){
age =newage ;
name =newname  ;
}
public int getter (){
return age ;
}
public String getter1 (){
return name ;
}
public void display (){
System.out.println ("your age is ::"+age+"and your name is ::"+name);
}
}



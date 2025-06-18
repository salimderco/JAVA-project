public class library {
static String name ="salim" ;
 static int num =10;
public void displayinfo (){
System.out.println ("this is the name "+name+"the num of the book is"+num);
}

static class book {
String bookname ;
book (bookname){
this.bookname =bookname ;}


public void displaybookinfo(){
System.out.println (+bookname) ;
System.out.println (+name) ;
System.out.println (+num) ;
}
}
}

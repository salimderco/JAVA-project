import java.util.Scanner;
public class tp08{
public static void main (String [] args ){
Scanner scanf =new Scanner (System.in);

System.out.println ("enter the num ::");
int mon=scanf.nextInt();
switch (mon){
case 1:System.out.println ("your month is jan @");
break ;
case 2:System.out.println ("your month is feb @");
break ;
case 3:System.out.println ("your month is mar @");
break ;
case 4:System.out.println ("your month is apr @");
break ;
case 5:System.out.println ("your month is may @");
break ;
case 6:System.out.println ("your month is jun @");
break ;
case 7:System.out.println ("your month is juny @");
break;
case 8:System.out.println ("your month is aut @");
break ;
case 9:System.out.println ("your month is sep @");
break ;
case 10:System.out.println ("your month is oct @");
break ;
case 11:System.out.println ("your month is nov :: which represent the birth of one of the greatest man ever the OG saaaallliiiiiimm");
break ;
case 12:System.out.println ("your month is dec @");
break ;
default :
System.out.println  ("your rong correct your input");
}

scanf.close();
}}
package Chap1202;


//FR Quiz 1204 Student Starting File

import java.util.Scanner;

public class FRQ1204
{
 public static void main(String[] args)
 {
     Magpie maggie = new Magpie();

     System.out.println (maggie.getGreeting());
     Scanner in = new Scanner (System.in);
     String statement = in.nextLine();

     while (!statement.equals("Bye"))
     {
         System.out.println (maggie.getResponse(statement));
         statement = in.nextLine();
     }
 }
}


class Magpie
{
 public String getGreeting()
 {
     return "Hello, let's talk.";
 }

 public String getResponse(String statement)
 {
     String response = "";
     if (statement.indexOf("no") >= 0)
     {
         response = "Why so negative?";
     }
     else if (statement.indexOf("mother") >= 0
             || statement.indexOf("father") >= 0
             || statement.indexOf("sister") >= 0
             || statement.indexOf("brother") >= 0)
     {
         response = "Tell me more about your family.";
     }
     else
     {
         response = getRandomResponse();
     }
     return response;
 }

 private String getRandomResponse()
 {
 

String[]responces= {"hello","i","am","funny","man"};
double size=responces.length;
int num=(int)(Math.random()*size);
return responces[num];



}
}
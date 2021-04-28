package Chap1202;

//FR Quiz 1202 Solution

import java.util.ArrayList;

public class FRQ1202
{
 public static void main(String[] args)
 {
   Names1 names = new Names1();
   names.addName("Tom");
   names.addName("Sue");
   names.addName("Bob");
   names.addName("Meg");
   
   names.showList();
   names.reverseList();
   names.showList();

 }
}




class Names1
{
 ArrayList<String> list;
 
 public Names1()
 {
     list = new ArrayList<String>();
 }

public void addName(String s)
{
   list.add(s);
}
 
 public void swapNames(int p, int q)
 {
     String temp = list.get(p);
     list.set(p,list.get(q));
     list.set(q,temp);
 }

public void reverseList()
 {
	int tmp=list.size()-1;
	for(int i=0;i<tmp;i++) {
		swapNames(i,tmp);
		tmp--;
	}






 }



public void showList()
{
   System.out.println(list);
}
}
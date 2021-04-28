package FRQ;

public class test
{
public static void main(String[] args)
{
Acme boston = new Acme(5);
System.out.println(boston); 
}
}


class Widget
{
private int widgets;

public Widget(int n)
{
widgets = n;
}
}


class Acme
{
private Widget[] widgets;

public Acme(int x)
{
widgets = new Widget[x];
}

public String toString()
{
String temp = "";
for (Widget w : widgets)
temp = temp + w + " ";
return temp; 
}
}

public class FRQ904{
	   public static void main(String[] args)
	   {
	     Acme acme = new Acme(100,200);
	     System.out.println(acme.getWidgets());
	     System.out.println(acme.getGidgets());
	   }
	}

	class Acme
	{
	   public int widgets;
	   public int gidgets;
	   
	   public Acme(int widgets, int gidgets)
	   {
		   this.widgets = widgets;
		   this.gidgets = gidgets;

	   }
	   
	   public int getWidgets()
	   {
	      return widgets;
	   }
	   
	   public int getGidgets()
	   {
	      return gidgets;
	   }   
	}
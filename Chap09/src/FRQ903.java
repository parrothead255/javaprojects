
public class FRQ903{
	   public static void main(String[] args)
	   {
	     System.out.println(getGCF(120,108));
	   }
	   
	   public static int getGCF (int num1, int num2)    
	    {
		    
		   	
		   	int rem = num1%num2;	   
		   	while(rem!=0) {
		   		num1=num2;
		   		num2=rem;
		   		rem=num1%num2;	
		   	}
		  


return num2;



	    }
	   
	}
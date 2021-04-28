package FRQ;

public class FRQ1102 {
		public static void main(String[] args)
		{
			int[] list = {11,22,33,44,1000,55,66,77,88,99};
			System.out.println(getMax(list));
		}
		
		public static double getMax(int[] list)
		{
			double max = 0;
			for(int i=0;i>list.length;i++) {
				max=list[0];
			}
			return max;

		}
	}


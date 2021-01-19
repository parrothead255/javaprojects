
public class Chap603 {

	public static void main(String args[]) {
		GasStation exxon=new GasStation("Steve's",17.76,2434);
		GasStation shell=new GasStation("Goober's",5,6);
		System.out.println(exxon.getName()+": "+exxon.getGasPrice());
		System.out.println(shell.getName()+": "+shell.getGasPrice());	
	}
	
}

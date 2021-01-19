
public class GasStation {
	String name;
	double gasPrice;
	double dailyProfit;
	
	public GasStation(String n, double gP, double dP) {
		name=n;
		gasPrice=gP;
		dailyProfit=dP;
	}
	public void setName(String n) {
		name=n;	
	}
	public String getName() {
		return name;
	}
	public void setGasPrice(Double gP) {
		gasPrice=gP;		
	}
	public double getGasPrice() {
		return gasPrice;
	}
	
}


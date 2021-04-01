package Vehicle;

public class Vehicle implements Loan, Insurance{
	
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	@Override
    public double issueLoan(){
        if(vehicleType.equals("4 wheeler")){
            return price*0.8;
        }
        else if(vehicleType.equals("3 wheeler")){
            return price*0.75;
        }
        else{
            return price*0.5;
        }
    }

    public double takeInsurance(){
        if(price<=150000){
            return 3500;
        }
        else if(price>150000 && price<300000){
            return 4000;
        }
        else{
            return 5000;
        }
    }

	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Vehicle(String vehicleNumber, String modelName, String vehicleType,double price) {
		
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType=vehicleType;
		this.price = price;
	}

}

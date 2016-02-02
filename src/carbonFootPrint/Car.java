package carbonFootPrint;

public class Car implements CarbonFootPrint {
	
	private String make;
	private String model;
	
	public Car(String ma, String mo)
	{
		make = ma;
		model = mo;
	}
	
	public void setMake(String ma)
	{
		make = ma;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public void setModel(String mo)
	{
		model = mo;
	}
	
	public String getModel()
	{
		return model;
	}
	
	@Override
	public void getCarbonFootPrint()
	{
		
	}
	

}

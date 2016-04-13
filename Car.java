package beans;

public class Car {
	
	private String carname;
	private Engine engine;
	
	public Car(){
		
		System.out.println("Car");
	}
	
	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printCarData()
	{	
		System.out.println("Carname= "+ carname);
		System.out.println("ModelYear= "+engine.getModelyear());
	}

}

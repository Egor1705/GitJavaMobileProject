package model;




import interfaces.Mobile;

public abstract class SiemensMobile implements Mobile{
protected static double price;
protected static double bateryCapacity;
protected static double memoryCapacity;

	public SiemensMobile(double price,double bateryCapacity,double memoryCapacity){
		
	}
	
	public Model createAX72()  {
		Model phone = new Model(price,bateryCapacity, memoryCapacity);
		return phone;
}
}
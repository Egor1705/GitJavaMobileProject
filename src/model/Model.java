package model;

import java.util.ArrayList;
import java.util.List;




import input.Input;


public class Model extends SiemensMobile {
	
	public Model(double price,double bateryCapacity,double memoryCapacity){
	super(price,bateryCapacity, memoryCapacity);
}
	public static  List<String> listCage = new ArrayList<>();
	
//создание телефонов
	
	@Override
	public Model createA31()  {
		double price = Input.megaInputPrice("Введите цену телефона:"); 
		double bateryCapacity = Input.megaInputBatery("Сколько часов держится батарея:");
		double memoryCapacity = Input.megaInputMemory("Сколько памяти в телефоне:");
		Model phone = new Model(price,bateryCapacity, memoryCapacity);
		listCage.add("SiemensA31");
		return phone;
		}
	
	@Override
	public  Model createA62() {
		double price = Input.megaInputPrice("Введите цену телефона:"); 
		double bateryCapacity = Input.megaInputBatery("Сколько часов держится батарея:");
		double memoryCapacity = Input.megaInputMemory("Сколько памяти в телефоне:");
		Model phone = new Model(price,bateryCapacity, memoryCapacity);
		listCage.add("SiemensA62");
		return phone;
	}
	
	@Override
	public Model createA55()  {
		double price = Input.megaInputPrice("Введите цену телефона:"); 
		double bateryCapacity = Input.megaInputBatery("Сколько часов держится батарея:");
		double memoryCapacity = Input.megaInputMemory("Сколько памяти в телефоне:");
		Model phone = new Model(price,bateryCapacity, memoryCapacity);
		listCage.add("SiemensA55");
		return phone;
	}

	@Override
	public Model createAX72() {
			double price = Input.megaInputPrice("Введите цену телефона:"); 	
			double bateryCapacity = Input.megaInputBatery("Сколько часов держится батарея:");
			double memoryCapacity = Input.megaInputMemory("Сколько памяти в телефоне:");
			Model phone = new Model(price,bateryCapacity, memoryCapacity);
			listCage.add("SiemensAX72");
			return phone;
	}	
	
	
	
	
	public static void checkList(){
		System.out.println(listCage);
	}
	
	//покупка телефонов
	public static void buyMobileA31() {
		
		try
		{
			listCage.remove(listCage.get(0));
	}
	catch (IndexOutOfBoundsException ex)
	{
		
		System.out.println("Такого телефона нет в каталоге ");
	}
	
	}	
	
	public static void buyMobileA55() {
		
		try
		{
			listCage.remove(listCage.get(1));
	}
	catch (IndexOutOfBoundsException ex)
	{
		System.out.println("Такого телефона нет в каталоге");
	}
	
	}	
	
	public static void buyMobileA62() {
		
			try
			{
		listCage.remove(listCage.get(2));
		}
		catch (IndexOutOfBoundsException ex)
		{
			System.out.println("Такого телефона нет в каталоге");
		}
	}
		
	public static void buyMobileAX72() {
	try
	{
listCage.remove(listCage.get(3));
}
catch (IndexOutOfBoundsException ex)
{
	System.out.println("Такого телефона нет в каталоге");
}

}
	
}
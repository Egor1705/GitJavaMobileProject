package input;

import main.Main;

public class Input {
	 public static double megaInputPrice(String str) {
		 System.out.println(str);
		 while(true) {
		     Double input = Main.sc.nextDouble();
		   
		   if(input>300 && input<600){
		       return  input;
		   }
		   else{
		  System.out.println("300 < ���� �������� < 600");
		   }
		     
		 }
	        
	    }
	 public static double megaInputBatery(String str){
		 System.out.println(str);
		 while(true) {
		     Double input = Main.sc.nextDouble();		    
		     if(input>72 && input<250){
		       return  input;}
		     else{
		   System.out.println("������� �������� Siemens ����� ��������� �� 73-� �� 250-�� �����");  
		     }
		     
		 }
	 }
	 public static double megaInputMemory(String str){
		 System.out.println(str);
		 while(true) {
		     Double input = Main.sc.nextDouble();	    
		     if(input>200 && input<400){
		       return  input;}
		     else{
		     System.out.println("200 < ������ � �������� Siemens < 400");
		     }
		 }
	 }
	
}


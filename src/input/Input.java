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
		  System.out.println("300 < Öåíà òåëåôîíà < 600");
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
		   System.out.println("Áàòàğåÿ òåëåôîíà Siemens ìîæåò äåğæàòüñÿ îò 73-õ äî 250-òè ÷àñîâ");  
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
		     System.out.println("200 < Ïàìÿòü â òåëåôîíå Siemens < 400");
		     }
		 }
	 }
	
}


package main;

import java.util.Scanner;



import methods.Methods;
import model.Model;



public class Main {
public static Scanner sc =new Scanner(System.in);
	public static void main(String[] args)  {
		
		boolean check = true;
		
		while(check){
			System.out.println("�������� ��������:\n"
					+" 1)������� ������� � ������� ��� � �������:\n"
					+" 2)��������� ������� ��������\n"
					+" 3)������ �������:\n"
					+" 4)�����");
			String str = sc.nextLine();
			switch(str){
			case "1":{
				createMobile();
			break;
			}
			case "2":{
				Model.checkList();
			break;
			}
			case "3":{
				mobileBuy();
				break;
			}
			case "4":{
				System.out.println("�����"); 
				check = false;
			}
			}
			
		}
	}
	private static void createMobile() {
	boolean check = true;
		while(check){
			System.out
			.println("�������� ,����� ������ ������ �������: \n"
					+ "1. Siemens A31;\n"
					+ "2. Siemens A55;\n"
					+ "3. Siemens A62;\n"
					+ "4. Siemens AX72;\n"
					+ "������� ����� �� ������,���� ������ ������� ���-��;\n "
					+ "0. ���� ������ �����");
	int selectPhone = sc.nextInt();
	if (selectPhone == 1) {
		Methods.methodA31();

	} else if (selectPhone == 2) {
	Methods.methodA55();

	} else if (selectPhone == 3) {
		Methods.methodA62();

	} else if (selectPhone == 4) {
		Methods.methodAX72();

	} else {
		check = false;
	}
	
		}
	
	}
	
	public static void mobileBuy(){
		boolean check = true;
		while(check){
			System.out
			.println("�������� ,����� ������ ������ ������: \n"
					+ "1. Siemens A31;\n"
					+ "2. Siemens A55;\n"
					+ "3. Siemens A62;\n"
					+ "4. Siemens AX72;\n"
					+ "������� ����� �� ������:\n "
					+ "0. ���� ������ �����");
	int selectPhone = sc.nextInt();
	if (selectPhone == 1) {
	Model.buyMobileA31();
	} else if (selectPhone == 2) {
		Model.buyMobileA55();
	} else if (selectPhone == 3) {
	Model.buyMobileA62();
	} else if (selectPhone == 4) {
		Model.buyMobileAX72();
	} else {
		check = false;
	}
		}
	}
	
}

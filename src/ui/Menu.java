package ui;

import java.util.Scanner;

import model.Restaurant;

public class Menu {
	private Restaurant r;
	private final static int EXIT_OPTION = 3;
	private Scanner sc;
	private Restaurant restaurant;
	
	public Menu() {
		sc = new Scanner(System.in);
	}
	
	public void startMenu() {
		String menu = getMenuText();
		int option;
		do {
			System.out.print(menu);
			option = readOption();
			executeOperation(option);
		}while(option!=EXIT_OPTION);
	}
	
	private String getMenuText() {
		String menu;
		menu  = "==============================\n";
		menu += "      ORDER SYSTEM\n";
		menu += "==============================\n";
		menu += "1. Add restaurant\n";
		menu += "2. Add client \n";
		menu += "3. Add product\n";
		menu += "4. Add order \n";
		menu += "5. Add Restaurant\n";
		menu += "6. Add client \n";
		menu += "7. Exit\n";
		menu += "Please enter the option: ";
		return menu;
	}
	
	private int readOption() {
		int op;
		op = Integer.parseInt(sc.nextLine());
		return op;
	}
	
	private void executeOperation(int option) {
		switch(option) {
			case 1: addRestaurant();   break;
			case 2: addClient(); break;
			case 3: addProduct();   break;
			case 4: addOrder(); break;
			case 5: exitProgram(); break;
			default: break;
		}
	}
	
	private void exitProgram() {
		sc.close();
	}
	private void addRestaurant() {
		System.out.print("Please enter the restaurant name: ");
		String name= sc.nextLine();;
		System.out.print("Please enter the nit: ");
		String nit = sc.nextLine();
		System.out.print("Please enter the name of the restaurant manager: ");
		String manager= sc.nextLine();
		
		restaurant.addRestaurant(name,nit,manager);
		
		System.out.println("The restaurant has been added succesfully");
		}	
	private void addClient() {
		System.out.print("Please enter the full name: ");
		String name= sc.nextLine();;
		System.out.print("Please enter the identification type: ");
		String id_type = sc.nextLine();
		System.out.print("Please enter the identification number: ");
		String id_number= sc.nextLine();
		System.out.print("Please enter the phone number: ");
		String phone = sc.nextLine();
		System.out.print("Please enter the adress: ");
		String adress= sc.nextLine();
		
		restaurant.addClient(id_type,id_number,name,phone,adress);
		
		System.out.println("The client has been added succesfully");
	}
	private void addProduct() {
		System.out.print("Please enter the product name: ");
		String name= sc.nextLine();;
		System.out.print("Please enter the description of the product: ");
		String description = sc.nextLine();
		System.out.print("Please enter the code: ");
		String code= sc.nextLine();
		System.out.print("Please enter the cost of the product: ");
		String cost = sc.nextLine();
		System.out.print("Please enter the nit of restaurant to belongs: ");
		String nit= sc.nextLine();
		
		restaurant.addProduct(code,name,description,cost,nit);
		
		System.out.println("The product has been added succesfully");
	}
	private void addOrder() {
		System.out.print("Please enter the nit of the restaurant who belongs the order : ");
		String nit = sc.nextLine();
		System.out.print(r);
		System.out.println("Choose the product you want by writing the number in which the products are ordered");
		int option=Integer.parseInt(sc.nextLine());
		System.out.print("Please enter the code of the client: ");
		String code= sc.nextLine();

		
		restaurant.addOrder();
		
		System.out.println("The product has been added succesfully");
	}
}
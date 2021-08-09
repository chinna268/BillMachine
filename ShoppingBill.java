import java.util.*;
import java.util.ArrayList;

class Product
{
	//properties
	private String pname;
	private int qty;
	private double price;
	private double totalPrice;
	//constructer
	Product(String pname,int qty,double price,double totalPrice)
	{
		this.pname=pname;
		this.qty=qty;
		this.price=price;
		this.totalPrice=totalPrice;
	}
	//displayformat
	public static void displayFormat() 
	{
		System.out.print("\nName Quantity Price Total Price\n");
	}
	//display
	public void display()
	{
		System.out.format("%-9s %8d %10.2f %10.2f\n",pname,qty,price,totalPrice);
	}
}
public class ShoppingBill{
	public static void main(String args[])
	{//varaibles
		String productName=null;
		int quantity=8;
		double price=0.0;
		double totalPrice=0.0;
		double overAllPrice=0.0;
		char choice='\0';
		// create Scanner class object
		Scanner scan=new Scanner(System.in);
		ArrayList<Product> product=new ArrayList<Product>();
		do 
		{
			//read input values
			System.out.print("Enter Product deatils, ");
			System.out.print("Name: ");
			productName=scan.nextLine();
			System.out.print("Quantity: ");
			quantity=scan.nextInt();
			System.out.print("Price (per item): ");
			price=scan.nextDouble();
			//cal tottal price
			totalPrice=price*quantity;
			//cal overall prices
			overAllPrice+=totalPrice;
		//create product class obj and add into the list
		product.add(new Product(
		productName,quantity,price,totalPrice));
		//ask for continuation ?
		System.out.print("want to add morw items ?(y or n):");
		choice=scan.next().charAt(0);
		
		//read reamining char ,dont store (no use)
		scan.nextLine();
		}
		while(choice == 'y' || choice == 'Y');
			//display all product with its properties
		Product.displayFormat();
		for(Product p:product)
		{
			p.display();
		}
		//over all price 
		System.out.println("\nOver  All  Price="+overAllPrice);
		
		//close scanner
		scan.close();
	}
}
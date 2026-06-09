package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Product> list = new ArrayList<>(); 
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Product #" + i+1 + " data:");
			System.out.print("Commom, used or imported (c/u/i)?");
			sc.nextLine();
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (ch == 'c') {
				list.add(new Product(name, price));
			}
			else if (ch == 'u'){
				System.out.print("Manufacture Date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			}
			else {
				System.out.print("Customs Fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product tags : list) {
			System.out.println(tags.priceTag());
		}
		
		sc.close();
	}

}


package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalDate;

import dao.ProductServiceImpl;
import model.Product;
import service.ProductService;

public class ProductApp {
	public static void main(String[] args) throws IOException {
		ProductService service=new ProductServiceImpl();
		Reader reader = new FileReader("./src/main/java/input.txt");
		BufferedReader br=new BufferedReader(reader);
		
		String line=null;
		while((line=br.readLine())!=null) {
			String tokens[]=line.split(",");
			String pname=tokens[0];
			double price = Double.parseDouble(tokens[1]);
			LocalDate dt= LocalDate.parse(tokens[2]);
			String catagory=tokens[3];
			
			Product p=new Product(pname,price,dt,catagory);
			Product pObj=service.addProduct(p);
			if(pObj!=null) {
				System.out.println(pObj.getProductName()+" "+"added successfully");
			}
			else {
				System.out.println("Not able to add");
			}
			
		}
	}

}

package service;

import java.util.List;

import exception.InvalidProductException;
import model.Product;

public interface ProductService {
	
	public Product addProduct(Product product);
	public List<Product> getAllProduct();
	public int updateProduct(long productId,Product product);
	public Product removeProduct(long productId) throws InvalidProductException;
	public List<Product> searchProduct(String byName);
	public List<Product> searchByCategory();
	public List<Product> arrangeByHigherPriceToLowPrice();
	public double getTotalPrice();
	public int countAllProduct();
	public Product getProductWithMaxPrice();
	public double calculateGST();
	public Product getProductById(long productId);
	

}

package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import exception.InvalidProductException;
import model.Product;
import service.ProductService;
import utility.Driver;

public class ProductServiceImpl implements ProductService{

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		EntityManager em=Driver.getConnect();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(product);

		et.commit();
		return product;
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		EntityManager em=Driver.getConnect();
		EntityTransaction et=em.getTransaction();
		
		Query q= em.createQuery("Select p from Product p");
		List<Product> result=(List<Product>)q.getResultList();
		
		return result;
	}

	@Override
	public int updateProduct(long productId, Product product) {
		// TODO Auto-generated method stub
		EntityManager em=Driver.getConnect();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Query q=em.createQuery("Update Product p"
				+ "set p.productName=: name,"
				+"p.productPrice=:price, p.productCategory=: category "
				+ "where p.productId=:Id");
		
		q.setParameter("name", product.getProductName());
		q.setParameter("price", product.getProductPrice());
		q.setParameter("category", product.getProductCatagory());
		q.setParameter("id", productId);
		
		// int executeUpdate() method is the method of 
		int status =q.executeUpdate();
		et.commit();
		return status;
	}

	@Override
	public Product removeProduct(long productId) throws InvalidProductException {
		// TODO Auto-generated method stub
		EntityManager em=Driver.getConnect();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		// First way to do this
		Product p=em.find(Product.class,productId);
		/*Query q=em.createQuery(" delete from product p where p.productId=: id");
		q.setParameter("id", productId);
		q.executeUpdate();*/
		
		
		// Second way of doing this
		em.remove(p);
		if(p!=null)
			throw new InvalidProductException("Product not found");
		return p;
	}

	@Override
	public List<Product> searchProduct(String byName) {
		// TODO Auto-generated method stub
		EntityManager em=Driver.getConnect();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.find(Product.class, byName);
		return null;
	}

	@Override
	public List<Product> searchByCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> arrangeByHigherPriceToLowPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getTotalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countAllProduct() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product getProductWithMaxPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculateGST() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product getProductById(long productId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

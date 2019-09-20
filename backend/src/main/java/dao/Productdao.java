package dao;

import hibernate.backend.Product;

public interface Productdao {
		public boolean addProduct(Product p);
		public Product findProduct(int id);
		public boolean updateProduct(Product p);
		public boolean deleteProduct(Product p);
		public java.util.List<Product>getAllproducts();
		

	}


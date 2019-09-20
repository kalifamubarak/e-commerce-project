package dao;

import hibernate.backend.Cart;

public interface Cartdao {
		boolean addCart(Cart c);
		boolean deleteCart(Cart c);
		Cart findCart(int id);
		boolean updateCart(Cart c);
		java.util.List<Cart> getAllCarts();
		int totalelements(String cartid);
	}

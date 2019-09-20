	package dao;

import hibernate.backend.Payment;


public interface Paymentdao {
	boolean addPayment(Payment a);
	boolean updatePayment(Payment a);
	public Payment findPayment(int id);
	public boolean deletePayment(Payment a);
	java.util.List<Payment> getAllPayments(String cartid);
}

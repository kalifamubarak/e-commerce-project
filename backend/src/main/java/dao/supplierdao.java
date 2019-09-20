package dao;

import hibernate.backend.supplier;

public interface supplierdao {
		public boolean addsupplier(supplier n);
		public supplier findsupplier(int id);
		public boolean updatesupplier(supplier n);
		public boolean deletesupplier(supplier n);
		public java.util.List<supplier>getAllsuppliers();
		

	}


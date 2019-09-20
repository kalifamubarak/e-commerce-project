package dao;

import hibernate.backend.category;

public interface categorydao {
		public boolean addcategory(category m);
		public category find(int id);
		public boolean updatecategory(category m);
		public boolean deletecategory(category m);
		public java.util.List<category>getAllcategorys();
		

	}



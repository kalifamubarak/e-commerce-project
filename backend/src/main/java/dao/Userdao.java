package dao;

import hibernate.backend.User;

public interface Userdao {
	public boolean addUser(User u);
	public User findUser(int id);
	public boolean updateUser(User u);
	public boolean deleteUser(User u);
	public java.util.List<User>getAllUsers(); 
}

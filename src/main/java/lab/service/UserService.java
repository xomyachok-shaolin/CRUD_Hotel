package lab.service;

import java.util.List;

import lab.model.User;

public interface UserService {

	/*
	 * CREATE and UPDATE 
	 */
	public void saveUser(User user);

	/*
	 * READ
	 */
	public List<User> listUsers();
	public User getUser(Long id);

	/*
	 * DELETE
	 */
	public void deleteUser(Long id);

}

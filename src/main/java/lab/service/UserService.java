package lab.service;

import java.util.List;

import lab.model.User;

public interface UserService {

	/*
	 * CREATE and UPDATE 
	 */
	void saveUser(User user);

	/*
	 * READ
	 */
	List<User> listUsers();
	User getUser(Long id);

	/*
	 * DELETE
	 */
	void deleteUser(Long id);

}

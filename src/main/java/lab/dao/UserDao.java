package lab.dao;

import java.util.List;
import lab.model.User;

public interface UserDao {

	/*
	 * CREATE and UPDATE
	 */
	public void saveUser(User user); // create and update

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

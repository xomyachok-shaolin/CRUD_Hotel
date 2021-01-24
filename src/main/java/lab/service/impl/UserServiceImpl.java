package lab.service.impl;

import java.util.List;

import lab.dao.UserDao;
import lab.model.User;
import lab.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Transactional
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	@Transactional(readOnly = true)
	public List<User> listUsers() {
		return userDao.listUsers();
	}

	@Transactional(readOnly = true)
	public User getUser(Long id) {
		return userDao.getUser(id);
	}

	@Transactional
	public void deleteUser(Long id) {
		userDao.deleteUser(id);

	}

}

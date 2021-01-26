package lab.dao.impl;

import java.util.List;

import lab.dao.RoomDao;
import lab.model.Room;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoomDaoImpl implements RoomDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveRoom(Room room) {
		getSession().merge(room);

	}

	@SuppressWarnings("unchecked")
	public List<Room> listRooms() {

		return getSession().createCriteria(Room.class).list();
	}

	public Room getRoom(Long id) {
		return (Room) getSession().get(Room.class, id);
	}

	public void deleteRoom(Long id) {

		Room room = getRoom(id);

		if (null != room) {
			getSession().delete(room);
		}

	}

	private Session getSession() {
		Session sess = getSessionFactory().getCurrentSession();
		if (sess == null) {
			sess = getSessionFactory().openSession();
		}
		return sess;
	}

	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}

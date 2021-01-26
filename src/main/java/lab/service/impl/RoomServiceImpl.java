package lab.service.impl;

import java.util.List;

import lab.dao.RoomDao;
import lab.model.Room;
import lab.service.RoomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoomDao roomDao;

	@Transactional
	public void saveRoom(Room room) {
		roomDao.saveRoom(room);
	}

	@Transactional(readOnly = true)
	public List<Room> listRooms() {
		return roomDao.listRooms();
	}

	@Transactional(readOnly = true)
	public Room getRoom(Long id) {
		return roomDao.getRoom(id);
	}

	@Transactional
	public void deleteRoom(Long id) {
		roomDao.deleteRoom(id);

	}

}

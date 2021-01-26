package lab.dao;

import java.util.List;
import lab.model.Room;

public interface RoomDao {

	/*
	 * CREATE and UPDATE
	 */
	public void saveRoom(Room room); // create and update

	/*
	 * READ
	 */
	public List<Room> listRooms();
	public Room getRoom(Long id);

	/*
	 * DELETE
	 */
	public void deleteRoom(Long id);
}

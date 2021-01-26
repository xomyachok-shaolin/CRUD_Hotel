package lab.service;

import java.util.List;

import lab.model.Room;

public interface RoomService {

	/*
	 * CREATE and UPDATE 
	 */
	public void saveRoom(Room room);

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

package lab.controller;

import lab.model.Room;
import lab.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping("/room")
public class RoomController {

	@Autowired
	private RoomService roomService;

	@RequestMapping(value = { "/", "/listRooms" })
	public String listRooms(Map<String, Object> map) {

		map.put("room", new Room());
		map.put("roomList", roomService.listRooms());

		return "/room/listRooms";
	}

	@RequestMapping("/get/{roomId}")
	public String getRoom(@PathVariable Long roomId, Map<String, Object> map) {

		Room room = roomService.getRoom(roomId);

		map.put("room", room);

		return "/room/roomForm";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveRoom(@ModelAttribute("room") Room room,
			BindingResult result) {

		roomService.saveRoom(room);

		/*
		 * Note that there is no slash "/" right after "redirect:" So, it
		 * redirects to the path relative to the current path
		 */
		return "redirect:listRooms";
	}

	@RequestMapping("/delete/{roomId}")
	public String deleteRoom(@PathVariable("roomId") Long id) {

		roomService.deleteRoom(id);

		/*
		 * redirects to the path relative to the current path
		 */
		// return "redirect:../listRooms";

		/*
		 * Note that there is the slash "/" right after "redirect:" So, it
		 * redirects to the path relative to the project root path
		 */
		return "redirect:/room/listRooms";
	}
}

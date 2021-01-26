package lab.controller;

import lab.model.Journal;
import lab.model.Room;
import lab.model.User;
import lab.service.JournalService;
import lab.service.RoomService;
import lab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/journal")
public class JournalController {

	@Autowired
	private JournalService journalService;

	@Autowired
	private UserService userService;

	@Autowired
	private RoomService roomService;

	@RequestMapping(value = { "/", "/listJournals" })
	public String listJournals(Map<String, Object> map) {

		map.put("journal", new Journal());
		map.put("journalList", journalService.listJournals());

		map.put("users", userService.listUsers());
		map.put("rooms", roomService.listRooms());

		return "/journal/listJournals";
	}

	@RequestMapping("/get/{journalId}")
	public String getJournal(@PathVariable Long journalId, Map<String, Object> map) {

		Journal journal = journalService.getJournal(journalId);

		map.put("users", userService.listUsers());
		map.put("rooms", roomService.listRooms());
		map.put("journal", journal);

		return "/journal/journalForm";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveJournal(@ModelAttribute("journal") Journal journal,
			BindingResult result) {

		journalService.saveJournal(journal);

		/*
		 * Note that there is no slash "/" right after "redirect:" So, it
		 * redirects to the path relative to the current path
		 */
		return "redirect:listJournals";
	}

	@RequestMapping("/delete/{journalId}")
	public String deleteJournal(@PathVariable("journalId") Long id) {

		journalService.deleteJournal(id);

		/*
		 * redirects to the path relative to the current path
		 */
		// return "redirect:../listJournals";

		/*
		 * Note that there is the slash "/" right after "redirect:" So, it
		 * redirects to the path relative to the project root path
		 */
		return "redirect:/journal/listJournals";
	}
}

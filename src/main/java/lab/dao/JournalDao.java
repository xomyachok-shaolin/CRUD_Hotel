package lab.dao;

import java.util.List;
import lab.model.Journal;

public interface JournalDao {

	/*
	 * CREATE and UPDATE
	 */
	public void saveJournal(Journal journal); // create and update

	/*
	 * READ
	 */
	public List<Journal> listJournals();
	public Journal getJournal(Long id);

	/*
	 * DELETE
	 */
	public void deleteJournal(Long id);
}

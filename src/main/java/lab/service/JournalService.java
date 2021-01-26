package lab.service;

import java.util.List;

import lab.model.Journal;

public interface JournalService {

	/*
	 * CREATE and UPDATE 
	 */
	public void saveJournal(Journal journal);

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

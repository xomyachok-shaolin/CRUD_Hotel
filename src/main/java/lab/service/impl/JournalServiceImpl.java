package lab.service.impl;

import java.util.List;

import lab.dao.JournalDao;
import lab.model.Journal;
import lab.service.JournalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JournalServiceImpl implements JournalService {

	@Autowired
	private JournalDao journalDao;

	@Transactional
	public void saveJournal(Journal journal) {
		journalDao.saveJournal(journal);
	}

	@Transactional(readOnly = true)
	public List<Journal> listJournals() {
		return journalDao.listJournals();
	}

	@Transactional(readOnly = true)
	public Journal getJournal(Long id) {
		return journalDao.getJournal(id);
	}

	@Transactional
	public void deleteJournal(Long id) {
		journalDao.deleteJournal(id);

	}

}

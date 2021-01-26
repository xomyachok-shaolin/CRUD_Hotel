package lab.dao.impl;

import java.util.List;

import lab.dao.JournalDao;
import lab.model.Journal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JournalDaoImpl implements JournalDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveJournal(Journal journal) {
		getSession().merge(journal);

	}

	@SuppressWarnings("unchecked")
	public List<Journal> listJournals() {

		return getSession().createCriteria(Journal.class).list();
	}

	public Journal getJournal(Long id) {
		return (Journal) getSession().get(Journal.class, id);
	}

	public void deleteJournal(Long id) {

		Journal journal = getJournal(id);

		if (null != journal) {
			getSession().delete(journal);
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

package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.helpers;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.orm.hibernate3.support.OpenSessionInViewFilter;

public class ReadWriteOpenSessionInView extends OpenSessionInViewFilter {
	public class SessionFilter extends OpenSessionInViewFilter {
		/*
		 * The default mode is FlushMode.NEVER
		 * 
		 * @see
		 * org.springframework.orm.hibernate.support.OpenSessionInViewFilter
		 * #getSession&#40;net.sf.hibernate.SessionFactory&#41;
		 */
		protected Session getSession(SessionFactory sessionFactory) throws DataAccessResourceFailureException {
			Session session = super.getSession(sessionFactory);
			logger.info("Getting session from ReadWriteOpenSessionInViewFilter");
			session.setFlushMode(FlushMode.AUTO);
			return session;
		}
	}
}

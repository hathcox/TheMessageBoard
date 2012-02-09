package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.dao.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.Board;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.User;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.dao.BoardDao;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.dao.UserDao;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.dao.hibernate.GenericDaoHibernate;

@Repository("userDao")
public class UserDaoHibernate extends GenericDaoHibernate<User> implements UserDao {

	public UserDaoHibernate() {
		super(User.class);
	}

	public User getUserByID(Long id) {
		//final List<Board> results = this.getHibernateTemplate().findByNamedParam("select board from Board board where board.id = :id", "id", id);
		//return results.isEmpty() ? null : results.get(0);
		return null;
	}

}

package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.dao.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.Comment;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.dao.CommentDao;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.dao.hibernate.GenericDaoHibernate;

@Repository("commentDao")
public class CommentDaoHibernate extends GenericDaoHibernate<Comment> implements CommentDao {

	public CommentDaoHibernate() {
		super(Comment.class);
	}

	@SuppressWarnings("unchecked")
	public Comment getCommentByID(Long id) {
		//final List<Board> results = this.getHibernateTemplate().findByNamedParam("select board from Board board where board.id = :id", "id", id);
		//return results.isEmpty() ? null : results.get(0);
		return null;
	}

}

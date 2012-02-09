package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.dao.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.Post;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.dao.PostDao;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.dao.hibernate.GenericDaoHibernate;

@Repository("postDao")
public class PostDaoHibernate extends GenericDaoHibernate<Post> implements PostDao {

	public PostDaoHibernate() {
		super(Post.class);
	}

	@SuppressWarnings("unchecked")
	public Post getPostByID(Long id) {
		//final List<Board> results = this.getHibernateTemplate().findByNamedParam("select board from Board board where board.id = :id", "id", id);
		//return results.isEmpty() ? null : results.get(0);
		return null;
	}

}

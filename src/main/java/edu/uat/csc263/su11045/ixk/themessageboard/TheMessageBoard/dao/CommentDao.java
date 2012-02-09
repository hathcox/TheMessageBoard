package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.dao;

import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.Comment;

public interface CommentDao extends GenericDao<Comment>{
	
	public Comment getCommentByID(Long id);

}

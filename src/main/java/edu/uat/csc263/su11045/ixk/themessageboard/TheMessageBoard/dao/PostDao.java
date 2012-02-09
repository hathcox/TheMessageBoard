package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.dao;

import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.Post;

public interface PostDao extends GenericDao<Post>{
	
	public Post getPostByID(Long id);

}

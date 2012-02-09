package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.service;

import java.util.List;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.*;
public interface BoardFacade {
	
	void saveBoard(Board board);
	void savePost(Post post);
	void saveComment(Comment comment);	
	void saveUser(User user);
	void saveGroup(Group group);
	
	List<Board> getBoards();
	List<Post> getPosts();
	List<Comment> getComments();
	List<User> getUsers();
	List<Group> getGroups();
	
	Board getBoardByID(Long id);
	Post getPostByID(Long id);
	Comment getCommentByID(Long id);
	User getUserByID(Long id);
	Group getGroupByID(Long id);

}

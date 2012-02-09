package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.Board;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.Comment;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.Group;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.Post;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.User;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.dao.BoardDao;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.dao.CommentDao;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.dao.PostDao;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.dao.UserDao;

@Service(value = "boardFacade")
@Transactional
public class BoardFacadeImpl implements BoardFacade{

	private BoardDao boardDao;
	private UserDao userDao;
	private PostDao postDao;
	private CommentDao commentDao;

	public UserDao getUserDao() {
		return userDao;
	}

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void saveBoard(Board board) {
		getBoardDao().save(board);
	}

	public void savePost(Post post) {
		getPostDao().save(post);
	}

	public void saveComment(Comment comment) {
		getCommentDao().save(comment);
	}

	public void saveUser(User user) {
		getUserDao().save(user);
	}

	public void saveGroup(Group group) {
		// TODO Auto-generated method stub
		
	}

	@Autowired
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	public BoardDao getBoardDao() {
		return boardDao;
	}
	
	@Autowired
	public void setPostDao(PostDao postDao) {
		this.postDao = postDao;
	}
	
	public PostDao getPostDao() {
		return postDao;
	}
	
	public CommentDao getCommentDao() {
		return commentDao;
	}
	
	@Autowired
	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}
	
	public List<Board> getBoards() {
		return getBoardDao().getAll();
	}

	public List<Post> getPosts() {
		return getPostDao().getAll();
	}

	public List<Comment> getComments() {
		return getCommentDao().getAll();
	}

	public List<User> getUsers() {
		return getUserDao().getAll();
	}

	public List<Group> getGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	public Board getBoardByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Post getPostByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comment getCommentByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Group getGroupByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

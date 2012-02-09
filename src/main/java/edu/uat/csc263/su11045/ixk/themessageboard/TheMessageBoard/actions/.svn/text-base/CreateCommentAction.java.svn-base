package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.actions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;

import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.Board;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.Comment;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.Post;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.service.BoardFacade;

public class CreateCommentAction extends ActionSupport {
	private transient BoardFacade boardFacade;
	private String content;
	private String topic;
	private String author;
	private boolean anonymous;
	private String postOwner;
	private List<Post> posts = new ArrayList<Post>();
	private List<Comment> comments = new ArrayList<Comment>();

	public String execute() throws Exception {
		LOG.info("Entering Create Comment Action...");
		Comment comment = new Comment(topic,content,author,postOwner,anonymous);
		getBoardFacade().saveComment(comment);
		setPosts(getBoardFacade().getPosts());
		setComments(getBoardFacade().getComments());
		LOG.info("Leaving Create Comment Action");
		return SUCCESS;
	}
	
	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getTopic() {
		return this.topic;
	}

	public void setAnonymous(boolean anonymous) {
		this.anonymous = anonymous;
	}

	public boolean getAnonymous() {
		return this.anonymous;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public List<Post> getPosts() {
		return this.posts;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Comment> getComments() {
		return this.comments;
	}

	public void setPostOwner(String postOwner) {
		this.postOwner = postOwner;
	}

	public String getPostOwner() {
		return this.postOwner;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public BoardFacade getBoardFacade() {
		return boardFacade;
	}

	@Autowired
	public void setBoardFacade(BoardFacade boardFacade) {
		this.boardFacade = boardFacade;
	}

}

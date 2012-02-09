package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.actions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;

import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.Board;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.Comment;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.Post;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.service.BoardFacade;

public class CreatePostAction extends ActionSupport {
	private transient BoardFacade boardFacade;
	private String content;
	private String topic;
	private String author;
	private boolean anonymous;
	private List<Post> posts = new ArrayList<Post>();
	private List<Comment> comments = new ArrayList<Comment>();

	public String execute() throws Exception {
		LOG.info("Entering Create Post Action...");
		Post post = new Post(topic,content,author,anonymous);
		getBoardFacade().savePost(post);
		setPosts(getBoardFacade().getPosts());
		setComments(getBoardFacade().getComments());
		LOG.info("Leaveing Create Post Action");
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

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return this.author;
	}

	public BoardFacade getBoardFacade() {
		return boardFacade;
	}

	@Autowired
	public void setBoardFacade(BoardFacade boardFacade) {
		this.boardFacade = boardFacade;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
}

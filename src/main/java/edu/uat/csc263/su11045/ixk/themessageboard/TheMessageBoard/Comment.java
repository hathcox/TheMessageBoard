package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard;

import java.util.Random;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "COMMENT")
public class Comment implements DomainObject{
	private Long commentID;
	private String topic;
	private String content;
	private String author;
	private String postOwner;
	private boolean privacy;

	public Comment(String topic, String content, String author, String postOwner, boolean privacy) {
		this.topic = topic;
		this.content = content;
		this.author = author;
		this.postOwner = postOwner;
		this.privacy = privacy;
	}

	Comment() {
		//Required for Hibernate
	}
	
	public String getPostOwner() {
		return postOwner;
	}

	public void setPostOwner(String postOwner) {
		this.postOwner = postOwner;
	}
	
	public String getTopic() {
		return topic;
	}

	public String getAuthor() {
		return author;
	}

	public String getContent() {
		return content;
	}
	
	public boolean getPrivacy() {
		return privacy;
	}
	
	@Id
	@GeneratedValue
	public Long getCommentID() {
		return commentID;
	}
	
	public void setCommentID(Long commentID) {
		this.commentID = commentID;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrivacy(boolean privacy) {
		this.privacy = privacy;
	}
}

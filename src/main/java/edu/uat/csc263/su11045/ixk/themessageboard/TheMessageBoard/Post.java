package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard;

import java.util.ArrayList;
import java.util.Random;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "POST")
public class Post implements DomainObject {
	private Long postID;
	private String topic;
	private String content;
	private String author;
	private boolean privacy;

	public Post(String topic, String content, String author, boolean privacy) {
		this.topic = topic;
		this.content = content;
		this.privacy = privacy;
		this.setAuthor(author);
	}

	Post() {
		// Required for Hibernate
	}

	public String getTopic() {
		return topic;
	}

	public String getContent() {
		return content;
	}

	public boolean getPrivacy() {
		return privacy;
	}

	@Id
	@GeneratedValue
	public Long getPostID() {
		return postID;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPostID(Long postID) {
		this.postID = postID;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setPrivacy(boolean privacy) {
		this.privacy = privacy;
	}

}

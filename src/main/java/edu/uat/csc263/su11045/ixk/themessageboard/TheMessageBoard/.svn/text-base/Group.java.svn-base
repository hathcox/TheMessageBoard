package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard;

import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GROUP")
public class Group {
	private String name;
	private Long groupID;
	private ArrayList<User> userList = new ArrayList<User>();
	private ArrayList<Post> postList = new ArrayList<Post>();

	public Group(String name) {
		this.name = name;
	}
	
	public Group(){
		//Required for Hibernate
	}
	
	@Basic
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue
	public Long getGroupID() {
		return groupID;
	}

	public void setGroupID(Long groupID) {
		this.groupID = groupID;
	}
	
	@Basic
	public ArrayList<User> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}
	
	@Basic
	public ArrayList<Post> getPostList() {
		return postList;
	}

	public void setPostList(ArrayList<Post> postList) {
		this.postList = postList;
	}

	public void addUser(String name, String password) {
		User temporary = new User(name, password);
		userList.add(temporary);
	}

	public void removeUser(int userID) {
		for (User temporary : userList) {
			if (temporary.getUserID() == userID) {
				userList.remove(temporary);
			}
		}
	}

	public void addPost(String topic, String content, String author, boolean privacy) {
		Post temporary = new Post(topic, content, author, privacy);
		postList.add(temporary);
	}

	public void removePost(int postID) {
		for (Post temporary : postList) {
			if (temporary.getPostID() == postID) {
				postList.remove(temporary);
			}
		}
	}

}

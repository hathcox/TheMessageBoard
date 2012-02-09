package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.actions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validation;

import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.User;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.service.BoardFacade;

@SuppressWarnings({ "deprecation", "serial" })
@Validation()
public class LoginUserAction extends ActionSupport {
	private transient BoardFacade boardFacade;
	private String name;
	private String password;
	@SuppressWarnings("rawtypes")
	private static Map session = new HashMap();
	List<User> users;

	@RequiredStringValidator(message = "Please enter a name", trim = true)
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@RequiredStringValidator(message = "Please enter a password")
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	@SuppressWarnings("rawtypes")
	public Map getSession() {
		return this.session;
	}

	public BoardFacade getBoardFacade() {
		return boardFacade;
	}

	@Autowired
	public void setBoardFacade(BoardFacade boardFacade) {
		this.boardFacade = boardFacade;
	}

	public List<User> getUsers() {
		return users;
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	private String loginUser(String name, String password, List<User> users) {
		for (User user : users) {
			if (user.getName().equals(name) && user.getPassword().equals(password)) {
				session.put("login","true");
				session.put("user", name);
				return SUCCESS;
			}
		}
		return ERROR;
	}
	
	public String execute() throws Exception {
		setSession(ActionContext.getContext().getSession());
		setUsers(getBoardFacade().getUsers());
		LOG.info("Got the following Users: "+getUsers());
		
		return loginUser(name, password, getUsers());
	}
}

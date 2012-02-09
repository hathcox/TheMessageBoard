package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.actions;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validation;

import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.User;
import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.service.BoardFacade;

@SuppressWarnings({ "serial", "deprecation" })
@Validation()
public class CreateUserAction extends ActionSupport {
	private transient BoardFacade boardFacade;
	private String name;
	private String password;

	@RequiredStringValidator(message = "Please eznter a name", trim = true)
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

	public BoardFacade getBoardFacade() {
		return boardFacade;
	}
	
	@Autowired
	public void setBoardFacade(BoardFacade boardFacade) {
		this.boardFacade = boardFacade;
	}
	
	public String execute()
    {
    	LOG.info("Creating User: "+name+" With Password: "+password);
    	User user = new User(name,password);
    	getBoardFacade().saveUser(user);
    	LOG.info("Leaving Create User Action");
    	return SUCCESS;
    }
	
	
}

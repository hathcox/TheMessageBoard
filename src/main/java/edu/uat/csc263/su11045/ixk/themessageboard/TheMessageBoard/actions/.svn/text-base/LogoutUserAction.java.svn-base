package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.actions;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.Validation;

@SuppressWarnings({ "deprecation", "serial" })
@Validation()
public class LogoutUserAction extends ActionSupport {
	@SuppressWarnings("rawtypes")
	private static Map session = new HashMap();
	

	public void setSession(Map session) {
		this.session = session;
	}

	@SuppressWarnings("rawtypes")
	public Map getSession() {
		return this.session;
	}

	public String logout() {
		setSession(ActionContext.getContext().getSession());
		session.clear();
		LOG.info("Cleared the users Sessions...");
		return SUCCESS;
	}
}

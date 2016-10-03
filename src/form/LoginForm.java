package form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import bean.User;

public class LoginForm extends ActionForm {

	private String login;
	private String pass;
	private User user;
	
	public LoginForm() {

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ActionErrors validate(ActionMapping map, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (this.getLogin() == null || "".equals(this.getLogin())) {
			errors.add("login", new ActionMessage("login.vide"));
		}
		if (this.getPass() == null || "".equals(this.getPass())) {
			errors.add("pass", new ActionMessage("pass.invalide"));
		}
		return errors;
	}
}

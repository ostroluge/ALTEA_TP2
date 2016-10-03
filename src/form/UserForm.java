package form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import bean.User;

public class UserForm extends ActionForm {

	private static final long serialVersionUID = 8047293798262153112L;
	private String login;
	private String pass;
	private String email;
	private String ville;
	private List<User> user;
	
	public UserForm() {

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}
}

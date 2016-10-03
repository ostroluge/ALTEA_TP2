package action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import bean.User;
import form.UserForm;
import metier.GestUsers;

public class UsersAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
		UserForm userForm = (UserForm)form;
		
		List<User> users = new ArrayList<>();
		GestUsers gu = GestUsers.getInstance();
		
		String login = userForm.getLogin();
		String pass = userForm.getPass();
		
		if (validateLogin(login) && validatePass(pass)) {
			gu.addUser(login, pass, userForm.getEmail(), userForm.getVille());
		}
		
		users = gu.selectAll();
		userForm.setUser(users);
		return mapping.findForward("listUsers");		
	}

	public boolean validateLogin(String login) {
		if (login == null || login.toString().trim().equals("")) {
			return false;
		}
		return true;
	}
	
	public boolean validatePass(String pass) {
		if (pass == null || pass.toString().trim().equals("")) {
			return false;
		}
		return true;
	}
}


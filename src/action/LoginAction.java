package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import bean.User;
import form.LoginForm;
import metier.GestUsers;

public class LoginAction extends Action {

	public ActionForward execute(ActionMapping map, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		LoginForm lf = (LoginForm) form;
		GestUsers gu = GestUsers.getInstance();
		User u = gu.loadUser(lf.getLogin(), lf.getPass());
		if (u != null) {
			lf.setUser(u);
			return map.findForward("bienvenue");
		} else {
			return map.findForward("notAutorised");
		}
	}
}

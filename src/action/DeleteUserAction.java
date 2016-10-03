package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionRedirect;

import bean.User;
import metier.GestUsers;

public class DeleteUserAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse res) throws Exception {

		String userId = req.getParameter("idUser");

		GestUsers gu = GestUsers.getInstance();
		User user = gu.getUserById(Integer.parseInt(userId));

		if (user != null) {
			gu.deleteUser(user.getLogin(), user.getPass());
		}

		ActionRedirect ar = new ActionRedirect("/addUser.do");
		return ar;
	}
}

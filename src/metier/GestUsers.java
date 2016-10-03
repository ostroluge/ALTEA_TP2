package metier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import bean.User;

public class GestUsers {

	private HashMap<String, User> lesUtilisateurs;
	private int idUser;
	private static GestUsers instance;
	
	private GestUsers() {
		lesUtilisateurs = new HashMap<String, User>();
		User root = new User();
		root.setIdUser(idUser++);
		root.setLogin("root");
		root.setPass("root");
		root.setEmail("root@yahoo.fr");
		root.setVille("marseille");
		
		User guest = new User();
		guest.setIdUser(idUser++);
		guest.setLogin("guest");
		guest.setPass("guest");
		guest.setEmail("guest@yahoo.fr");
		guest.setVille("lille");
		
		lesUtilisateurs.put(root.getLogin() + "¤" + root.getPass(), root);
		lesUtilisateurs.put(guest.getLogin() + "¤" + guest.getPass(), guest);
	}
	
	public static GestUsers getInstance() {
		if (instance == null) {
			instance = new GestUsers();
		}
		return instance;
	}
	
	public User loadUser(String login, String pass) {
		User user = lesUtilisateurs.get(login + "¤" + pass);
		if (user != null) {
			return user;
		}
		return null;
	}

	public void addUser(String login, String pass, String email, String ville) {
		User user = new User();
		user.setIdUser(idUser++);
		user.setLogin(login);
		user.setPass(pass);
		user.setEmail(email);
		user.setVille(ville);
		
		lesUtilisateurs.put(user.getLogin() + "¤" + user.getPass(), user);
	}

	public void deleteUser(String login, String pass) {
		lesUtilisateurs.remove(login + "¤" + pass);
	}
	
	public List<User> selectAll() {
		List<User> users = new ArrayList<>();
		for (String key : lesUtilisateurs.keySet()) {
			users.add(lesUtilisateurs.get(key));
		}
		return users;
	}
}

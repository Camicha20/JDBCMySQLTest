package test;

import java.sql.ResultSet;
import java.util.ArrayList;

import model.User;

public class UserDaoTest {
	public static void main(String[] arg) {
		UserDao userDao = new UserDao();
		ArrayList<User> users = userDao.findAll();
		System.out.println("rows = " + users.size());
		
		User user = userDao.find(10);
		System.out.print(user.getName());
	}

}
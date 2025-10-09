package test;

import java.sql.ResultSet;

public class UserDaoTest {
	public static void main(String[] arg) {
		UserDao userDao = new UserDao();
		userDao.insert(0, null, 10, null, null, false);
		//eliminar un usuario con su id
		userDao.delete(10);
	}

}

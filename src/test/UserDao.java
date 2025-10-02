package test;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;

/**
 * data access object for user table
 */
public class UserDao {
	public void insert(int id, String name, int age, String email, String password, boolean Vip ) {
		String insertSQL = "insert into users values(?, ?, ?, ?, ?, ?)";
		
		Connection connection = DBHelper.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement(insertSQL);
			/**
			 * La instancia/objeto de la clase PreparedStatement se encarga de sustituir los placeholders ? con los valores pasados
			 * a traves de los parametros, de manera que nos permite reutilizar el codigo aun más.
			 */
			ps.setInt(1, id);//Sustituye el primer placeholder con el valor de id
			ps.setString(2, name);//Sustituye el segundo placeholder con el valor de name
			ps.setInt(3, age);//Sustituye el tercer placeholder con el valor  de age
			ps.setString(4, email);//Sustituye el cuerto placeholder con el valor de email
			ps.setString(5, password);//Sustituye el quinto placeholder con el valor de password
			ps.setBoolean(6, Vip);//Sustituye el sexto placeholder con el vaor de Vip
			ps.executeUpdate();
			connection.close();
			
			
			//si nos devuelve 0, significa que no ha cambiado ninguna fila en la base de datos
			int result = ps.executeUpdate();
			System.out.print("insert rows" + result);
			//close the connection with the database
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void delete (int id) {
		
	}
	public void update (int id, String email) {
		
	}


	public User[] findAll() {
		String selectSQL = "select * from users";
		Connection connection = DBHelper.getConnection();
		
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(selectSQL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Object ResultSet = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private void preparStatement(String selectSQL) {
		// TODO Auto-generated method stub
		
	}
	public User find(int id) {
		return null;
	}
}

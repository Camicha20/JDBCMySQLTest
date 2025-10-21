package model;

public class User {

	public static final char[] getName = null;
	public String name = "Alejandro";
	int age;
	public String email;
	public String password;
	public String sex;
	long id;
// los artibutos

	

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int age, String name) {
		// TODO Auto-generated constructor stub

		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User(long id, int age, String name, String password, String sex, String email) {
		this.id = id;
		this.age = age;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.email = email;
	}

	public User(String string, int i, String string2, String string3, int j, boolean b) {
		// TODO Auto-generated constructor stub
	}

}

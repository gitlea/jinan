package action;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String loginName;
	private int age;
	private String psd;
	private double salary;
	private boolean sex;
	private byte[] head;
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String loginName, int age, String psd, double salary,
			boolean sex) {
		
		this.loginName = loginName;
		this.age = age;
		this.psd = psd;
		this.salary = salary;
		this.sex = sex;
	}
	public byte[] getHead() {
		return head;
	}
	public void setHead(byte[] head) {
		this.head = head;
	}
	private List<String> favs=new ArrayList<String>();
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPsd() {
		return psd;
	}
	public void setPsd(String psd) {
		this.psd = psd;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public List<String> getFavs() {
		return favs;
	}
	public void setFavs(List<String> favs) {
		this.favs = favs;
	}
	
	
}

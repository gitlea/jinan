package springTest0606.springTest0606;

public class Cat {
	private String color;
	private int age;
	private boolean sex;
	private float weight;
	
	
	
	
	
	
	
	
	public String getColor() {
		return color;
	}







	public int getAge() {
		return age;
	}







	public boolean isSex() {
		return sex;
	}







	public float getWeight() {
		return weight;
	}







	public Cat(String color, int age) {
		
		this.color = color;
		this.age = age;
	}







	public void setColor(String color) {
		this.color = color;
	}







	public void setAge(int age) {
		this.age = age;
	}







	public void setSex(boolean sex) {
		this.sex = sex;
	}







	public void setWeight(float weight) {
		this.weight = weight;
	}







	public Cat() {
		System.out.println("cat 正在构建。。。。");
	}
	
}

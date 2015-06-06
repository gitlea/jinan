package springTest0606.springTest0606;

public class XnDog implements Dog{
	private Hat hat;
	
	public void setHat(Hat hat) {
		this.hat = hat;
		System.out.println("XN dog 正在构建。。。。"+hat.getClass().getName());
	}




	public XnDog() {
		//hat=new GreenHat();
		
	}
	
	
}

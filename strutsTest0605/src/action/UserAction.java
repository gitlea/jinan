package action;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import net.sf.json.JSONObject;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	private InputStream  data;
	
	private User u;
	private  File   head;

	public User getU() {
		return u;
	}






	public File getHead() {
		return head;
	}






	public void setHead(File head) {
		this.head = head;
	}






	public void setU(User u) {
		this.u = u;
	}






	public InputStream getData() {
		
		
		
		JSONObject jso=JSONObject.fromObject(u);
		
		
		
		data=new ByteArrayInputStream(jso.toString().getBytes());
		
		
		return data;
	}

	



	
	public String login(){
//		System.out.println("working......"+loginName+","+(age+1));
//		ActionContext context=	ActionContext.getContext();
//		context.put("info", loginName+","+age);
//		context.getSession().put("info", "tom is not john!!!");
//		context.getApplication().put("info", "in application !!!!");
		
		return SUCCESS;
	}
	
	
	
	
	@Override
	public void validate() {
		String loginName=u.getLoginName();
		if(loginName==null || loginName.trim().length()<=3){
			addFieldError("u.loginName", "名字必须大于三位！");
		}
		
		double salary=u.getSalary();
		if(salary<0 || salary>=10000){
			addFieldError("u.salary", "工资数据有误！");
		}
		
	}






	public String reg(){
		try {
			InputStream in=new FileInputStream(head);
			byte[] bs=new byte[in.available()];
			in.read(bs);
			u.setHead(bs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ActionContext.getContext().put("user", u);
		
		
		
		return SUCCESS;
	}
	
	
	
	
	
}

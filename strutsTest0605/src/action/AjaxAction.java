package action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import net.sf.json.JSONObject;

import com.opensymphony.xwork2.ActionSupport;

public class AjaxAction extends ActionSupport {
	private InputStream userInfo;
	
	
	public InputStream getUserInfo() {
		return userInfo;
	}


	public String execute(){
		User u = new User("john",100,"123",23.45,true);
		System.out.println(u.getLoginName());
		JSONObject jso=JSONObject.fromObject(u);
		System.out.println(jso);
		userInfo=new ByteArrayInputStream(jso.toString().getBytes());
		
		return SUCCESS;
	}
	
	
}

package action;

import com.opensymphony.xwork2.ActionContext;

public class LoginAction {
	
	
	private String loginName;
	private int age;
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}



	
	public String login(){
		System.out.println("working......"+loginName+","+(age+1));
		ActionContext context=	ActionContext.getContext();
		context.put("info", loginName+","+age);
		context.getSession().put("info", "tom is not john!!!");
		context.getApplication().put("info", "in application !!!!");
		
		return "success";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

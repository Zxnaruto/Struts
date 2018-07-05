package indi.zx.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@SuppressWarnings("serial")
public class LoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		Map session=invocation.getInvocationContext().getSession();//接收LoginAction传来的值
		//session=ActionContext.getContext().getSession();
		if(session.get("loginSign")==null){//没传来
			return "login";
		}else{
			String result=invocation.invoke();//invocation调用，相当于success
			return result;
		}
		
	}

}

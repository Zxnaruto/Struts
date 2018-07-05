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
		Map session=invocation.getInvocationContext().getSession();//����LoginAction������ֵ
		//session=ActionContext.getContext().getSession();
		if(session.get("loginSign")==null){//û����
			return "login";
		}else{
			String result=invocation.invoke();//invocation���ã��൱��success
			return result;
		}
		
	}

}

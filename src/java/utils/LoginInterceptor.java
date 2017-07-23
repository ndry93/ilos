/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import controller.loginAction;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import static org.apache.struts2.StrutsStatics.HTTP_REQUEST;

/**
 *
 * @author ndry93
 */
public class LoginInterceptor extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation ai) throws Exception {
        Map<String, Object> session = ai.getInvocationContext().getSession();
        String loginId = (String) session.get("login");
//        System.out.println("----interceptor is executed "+loginId);
//        System.out.println("---ai.getAction().getClass() "+ai.getAction().getClass());
            
        if (loginId == null) 
        {
            //Allow user to authenticate
            //when login session variable is null, and context is in loginAction page
            if (ai.getAction().getClass().equals(loginAction.class))
            {
                return ai.invoke();
            }
            return Action.INPUT;
        }
        else 
        {
            //Redirect user to home page when he/she is already logged in
            //when login session variable equals true, and context is in loginAction page
            if("true".equals(loginId) && ai.getAction().getClass().equals(loginAction.class))
            {
                return Action.SUCCESS;
            }
            return ai.invoke();
        }
    }
    
}

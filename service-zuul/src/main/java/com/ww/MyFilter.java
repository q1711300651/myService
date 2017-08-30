package com.ww;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ww on 17/8/27.
 */
@Component
public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        RequestContext context=RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        HttpServletResponse response = context.getResponse();
        String token = request.getParameter("token");
        if(token==null){
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try {
                response.getWriter().write("token is not allowed null");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

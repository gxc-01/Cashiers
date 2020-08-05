package com.ly.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName CorsFilter
 * @Author alan.wang   QQ:3103484396
 * @Description 解决跨域问题的过滤器
 */
@Component
public class CorsFilter extends ZuulFilter
{
    @Override
    public String filterType() {
        //    pre：可以在请求被路由之前调用,拿到请求，在转发给对应的微服务之前的阶段
        //    route：在路由请求时候被调用，把请求转发给微服务之后的阶段
        //    post：在被代理的微服务返回结果后的阶段。
        //    error：被代理的微服务发生异常时的阶段
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletResponse response = ctx.getResponse();
        //解决跨域问题，只需要在响应的头信息中加入一些字段即可
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type,X-Requested-With,accept,Origin,Access-Control-Request-Method,Access-Control-Request-Headers,token");
        return null;
    }
}

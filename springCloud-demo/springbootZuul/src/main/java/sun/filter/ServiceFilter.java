package sun.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: shuangyan.sun
 * @Date: 2021/05/26/18:11
 * @Description:
 */
@Component
public class ServiceFilter extends ZuulFilter {
    Logger logger = LoggerFactory.getLogger(ServiceFilter.class);

    @Override
    public String filterType() {
        return "pre";// 定义filter的类型，有pre、route、post、error四种

    }

    @Override
    public int filterOrder() {
        return 0;// 定义filter的顺序，数字越小表示顺序越高，越先执行
    }

    @Override
    public boolean shouldFilter() {
        return true;// 表示是否需要执行该filter，true表示执行，false表示不执行

    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String token = request.getParameter("token");
        if(StringUtils.isBlank(token)){
            logger.info("there is no token");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try{
                ctx.getResponse().getWriter().write(" there is no token");
            }catch(Exception e){
                logger.error("写入失败！",e.getCause());
            }
        }
            logger.info("ok");

        return null;
    }
}

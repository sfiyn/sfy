package sun.client;

import common.entity.RestfulResult;
import org.springframework.stereotype.Component;
import sun.entity.ServiceInfo;

/**
 * @Author: shuangyan.sun
 * @Date: 2021/05/24/17:31
 * @Description:
 */
@Component
public class ServiceFallback implements ServiceFeignClient{

    @Override
    public RestfulResult hello(ServiceInfo serviceInfo) {
        RestfulResult result = new RestfulResult();
        result.setData("服务调用失败");
        return result;
    }
}

package sun.client;

import common.entity.RestfulResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.entity.ServiceInfo;

/**
 * @Author: shuangyan.sun
 * @Date: 2021/05/24/17:28
 * @Description:
 */
@Component
@FeignClient(value="springbootService",fallback = ServiceFallback.class)
public interface ServiceFeignClient {

    @RequestMapping(value = "/service/hello")
    RestfulResult hello(@RequestBody ServiceInfo serviceInfo);
}

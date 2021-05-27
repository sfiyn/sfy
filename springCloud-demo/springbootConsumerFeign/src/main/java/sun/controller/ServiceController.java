package sun.controller;

import common.entity.RestfulResult;
import common.utils.CommUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.client.ServiceFeignClient;
import sun.entity.ServiceInfo;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: shuangyan.sun
 * @Date: 2021/05/21/15:45
 * @Description:
 */
@RestController
public class ServiceController {
    @Autowired
   ServiceFeignClient serviceFeignClient;

    @RequestMapping(value = "/consumerService")
    public void hello(HttpServletRequest request, HttpServletResponse response,
                      @RequestBody ServiceInfo serviceInfo) {

        RestfulResult restfulResult = serviceFeignClient.hello(serviceInfo);

        CommUtils.printDataJason(response, restfulResult);
    }


}

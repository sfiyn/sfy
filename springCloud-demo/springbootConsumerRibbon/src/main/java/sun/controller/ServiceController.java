package sun.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import common.entity.RestfulResult;
import common.utils.CommUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sun.entity.ServiceInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: shuangyan.sun
 * @Date: 2021/05/21/15:45
 * @Description:
 */

/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
@RestController
public class ServiceController {
    @Autowired
    RestTemplate restTemplate;

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/consumerServiceRibbon")
    @HystrixCommand(fallbackMethod = "consumerServiceRibbonFallback")
    public String consumerServiceRibbon(@RequestBody ServiceInfo serviceInfo) {

        String result = restTemplate.postForObject("http://springbootService/service/rest",serviceInfo,String.class);

       return  result;
    }

    @RequestMapping(value = "consumerServiceRibbonFallback")
    public String consumerServiceRibbonFallback(@RequestBody ServiceInfo serviceInfo){

        return "consumerServiceRibbonFallback 异常 ： port "+port+" name: "+ serviceInfo.getName() + " !";
    }
}

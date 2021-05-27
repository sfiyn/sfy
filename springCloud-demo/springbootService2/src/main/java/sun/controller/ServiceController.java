package sun.controller;

import common.entity.RestfulResult;
import common.utils.CommUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.entity.ServiceInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: shuangyan.sun
 * @Date: 2021/05/21/15:45
 * @Description:
 */
@RestController
@RequestMapping(value = "service")
public class ServiceController {

    @RequestMapping(value = "hello")
    public void login(HttpServletRequest request, HttpServletResponse response,
                      @RequestBody ServiceInfo serviceInfo) {

        RestfulResult restfulResult = new RestfulResult();

        try {
            restfulResult.setData("Service2:Welcome " + serviceInfo.getName() + "!");
            CommUtils.printDataJason(response, restfulResult);
        } catch (Exception e) {
            e.printStackTrace();
        }

     //  return  CommUtils.printDataJason(response, restfulResult);
    }

    @RequestMapping(value = "rest")
    public String rest(@RequestBody ServiceInfo serviceInfo){

        return "Service2:Welcome " + serviceInfo.getName() + " !";
    }
}

package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * @Author: shuangyan.sun
 * @Date: 2021/05/21/15:41
 * @Description:
 */
@SpringBootApplication
@ServletComponentScan
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulComsumerClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulComsumerClientApplication.class);
    }
}

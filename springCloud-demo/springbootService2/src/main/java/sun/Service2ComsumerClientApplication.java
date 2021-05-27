package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: shuangyan.sun
 * @Date: 2021/05/21/15:41
 * @Description:
 */
@SpringBootApplication
@ServletComponentScan
@EnableDiscoveryClient
public class Service2ComsumerClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(Service2ComsumerClientApplication.class);
    }
}

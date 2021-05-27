package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: shuangyan.sun
 * @Date: 2021/05/21/15:41
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaComsumerClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaComsumerClientApplication.class);
    }
}

package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: shuangyan.sun
 * @Date: 2021/05/21/17:29
 * @Description:
 */
@EnableConfigServer
@SpringBootApplication
public class ConsumerClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerClientApplication.class,args);

    }
}

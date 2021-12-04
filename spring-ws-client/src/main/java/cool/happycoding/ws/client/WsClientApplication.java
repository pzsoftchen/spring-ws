package cool.happycoding.ws.client;

import cool.happycoding.code.ws.client.annotation.EnableWsClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * description
 *
 * @author pengzhenchen 2021/10/22 8:29 下午
 */

@EnableWsClients
@SpringBootApplication
public class WsClientApplication {


    public static void main(String[] args) {
        SpringApplication.run(WsClientApplication.class, args);
    }
}

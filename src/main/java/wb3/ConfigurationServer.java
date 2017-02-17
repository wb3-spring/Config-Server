package wb3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * Created by WBensing on 2/16/2017.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigurationServer {
    public static void main(String[] args){
        SpringApplication.run(ConfigurationServer.class, args);
    }
}

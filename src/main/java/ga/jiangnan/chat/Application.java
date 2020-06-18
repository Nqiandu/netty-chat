package ga.jiangnan.chat;

import ga.jiangnan.chat.util.IdWorker;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @Author JN
 * @Date 2020/6/17 22:59
 * @Version 1.0
 * @Description
 **/
@SpringBootApplication
@MapperScan(basePackages = "ga.jiangnan.chat.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Bean
    public IdWorker idWorker() {
        return new IdWorker(0, 0);
    }
}

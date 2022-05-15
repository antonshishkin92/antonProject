package lesson28;

import com.fasterxml.jackson.databind.ObjectMapper;
import lesson28.service.FoodService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRunner.class,args);
        final ConfigurableApplicationContext appContext = SpringApplication.run(SpringBootRunner.class, args);
        final FoodService foodService = appContext.getBean(FoodService.class);
        foodService.feed();

    }
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}

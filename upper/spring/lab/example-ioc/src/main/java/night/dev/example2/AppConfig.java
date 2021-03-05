package night.dev.example2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MyService myService() {
        return new MyServiceImpl();
    }

    @Bean
    public Dependency1 dep1() {
        return new Dependency1();
    }

    @Bean
    public Dependency2 dep2() {
        return new Dependency2();
    }
}

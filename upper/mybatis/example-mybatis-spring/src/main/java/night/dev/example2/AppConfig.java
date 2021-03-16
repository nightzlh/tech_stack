package night.dev.example2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:Beans.xml")
@Configuration
@MapperScan("night.dev.example2.mapper")
public class AppConfig {
    @Bean
    public TestBean testBea0n() {
        return new TestBean();
    }
}

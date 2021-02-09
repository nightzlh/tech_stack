package night.dev;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
//import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = {"night.dev"})
public class AppConfig {

}
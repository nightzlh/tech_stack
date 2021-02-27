package night.dev;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"night.dev"})
//@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {

}
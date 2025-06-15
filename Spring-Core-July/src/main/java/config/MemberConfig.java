package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages= {"model.annotation"})
@PropertySource("classpath:customerInfo.properties")
public class MemberConfig {

}

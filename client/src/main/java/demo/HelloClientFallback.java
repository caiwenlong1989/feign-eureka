package demo;

import org.springframework.stereotype.Component;

/**
 * @author caiwl
 * @date 2019/10/10 18:12
 */
@Component
public class HelloClientFallback implements HelloClient {
    @Override
    public String hello() {
        return "Hello World";
    }
}

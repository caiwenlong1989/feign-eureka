package demo;

import org.springframework.stereotype.Component;

@Component
public class HelloClientFallback implements HelloClient {
    @Override
    public String hello() {
        return "Hello World";
    }
}

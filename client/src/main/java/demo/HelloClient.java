package demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(name = "HelloServer", fallback = HelloClientFallback.class)
public interface HelloClient {
    @RequestMapping(value = "/", method = GET)
    String hello();
}

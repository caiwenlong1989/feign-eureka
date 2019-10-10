package demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author caiwl
 * @date 2019/10/10 18:12
 */
@FeignClient(name = "HelloServer", fallback = HelloClientFallback.class)
public interface HelloClient {
    @GetMapping("/")
    String hello();
}

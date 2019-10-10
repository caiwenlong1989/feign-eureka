package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author caiwl
 * @date 2019/10/10 18:13
 */
@RestController
public class HelloClientController {
    @Resource
    HelloClient client;

    @RequestMapping("/")
    public String hello() {
        return client.hello();
    }
}

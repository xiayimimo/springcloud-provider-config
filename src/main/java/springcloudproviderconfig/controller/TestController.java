package springcloudproviderconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

	@GetMapping("hello")
	public String hello() {
		return "hello spring-security!";
	}
	 @Value("${mybatis.mapperLocations}")
	    private String message;

	    @GetMapping("message")
	    public String getMessage() {
	        return this.message;
	    }
}

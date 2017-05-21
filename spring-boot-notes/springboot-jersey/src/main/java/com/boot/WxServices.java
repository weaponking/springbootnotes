package com.boot;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.springframework.stereotype.Component;

@Component
@Path("/wx")
public class WxServices {

	@GET
    public String test() {
        return "hello world";
    }
	
}

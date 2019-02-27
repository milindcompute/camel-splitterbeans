package com.example.JavaFileCopier;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("direct:start").split().method(CustomerService.class, "splitDepartments").to("stream:out");
	}
}

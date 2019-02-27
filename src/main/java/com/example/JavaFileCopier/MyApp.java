package com.example.JavaFileCopier;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;

public class MyApp {

	public static void main(String[] args) throws Exception {
		CamelContext camelContext = new DefaultCamelContext();
		camelContext.addRoutes(new MyRouteBuilder());
		camelContext.start();
		ProducerTemplate template = camelContext.createProducerTemplate();
		List<Department> depts = new ArrayList<Department>();
		depts.add(new Department(1, "add1", "zip1", "country1"));
		depts.add(new Department(2, "add2", "zip2", "country2"));
		depts.add(new Department(3, "add3", "zip3", "country3"));
		Customer customer = new Customer();
		customer.setDepartments(depts);
		template.sendBody("direct:start", customer);
	}

}

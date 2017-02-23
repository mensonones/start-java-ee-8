package br.com.javaee.controller;

import com.oracle.ozark.core.Models;

import javax.inject.Inject;
import javax.mvc.Controller;
//import javax.mvc.Models;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Controller
@Path("hw")
public class MyController {
	
	@Inject
	Models models;
	
	@GET
	public String helloWorld(@QueryParam("name")String name){
		this.models.put("msg", "Hello, " + name );
		return "/WEB-INF/jsp/hello.jsp";
	}

}

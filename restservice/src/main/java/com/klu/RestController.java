package com.klu;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;


//https://localhost:8080/restservices/rest
@ApplicationPath("/rest")
@Path("/")
public class RestController  extends Application{
	
	@GET
	@Path("/abc/{x}/{y}")
	public int fun1(@PathParam("x") int a, @PathParam("y") int b)
	{
		return a+b;
	}
	

	@GET
	@Path("/abc")
	public int fun2(@QueryParam("x") int a, @QueryParam("y") int b)
	{
		return a+b;
	}

}

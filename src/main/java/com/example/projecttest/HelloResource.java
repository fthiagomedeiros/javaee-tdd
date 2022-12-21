package com.example.projecttest;

import com.example.projecttest.upper.IUpper;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello-world")
public class HelloResource {

    @EJB
    private IUpper iUpper;

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }

    @GET
    @Path("/test")
    @Produces("application/json")
    public String helloWorld() {
        return "{'name': 'John'}";
    }
}
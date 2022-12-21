package com.example.projecttest;

import com.example.projecttest.upper.IUpper;
import javax.ejb.EJB;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/hello-world")
public class HelloResource {

    @EJB
    private IUpper iUpper;

    @GET
    @Produces("text/plain")
    public String hello(
        @QueryParam(value = "text") @DefaultValue("no_parameter_passed") String text) {
        return iUpper.upper(text);
    }

    @GET
    @Path("/test")
    @Produces("application/json")
    public String helloWorld() {
        return "{'name': 'John'}";
    }
}
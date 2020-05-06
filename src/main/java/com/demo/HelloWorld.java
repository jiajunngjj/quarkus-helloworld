package com.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/")
public class HelloWorld {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String greet() {
        return "Hello World!";
    }
}
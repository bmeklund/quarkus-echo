package com.github.meklund;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/echo")
public class EchoResource {

    private static final Logger logger = LoggerFactory.getLogger(EchoResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String echo() {
        logger.info("GET /echo - Returning");
        return "echo";
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String echo(String body) {
        logger.info("POST /echo with body: {} - Returning", body);
        return body;
    }
}
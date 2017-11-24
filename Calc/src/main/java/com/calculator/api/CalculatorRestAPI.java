package com.calculator.api;

import com.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1/calculator")
public class CalculatorRestAPI {

    @Autowired
    private CalculatorService calculatorService;

    /**
     * Calculate the sum of three numbers.
     *
     * @param a is the first parameter to sum up.
     * @param b is the second parameter to sum up.
     * @param c is the third parameter to sum up.
     * @return sum of a, b and c.
     * @throws NumberFormatException if @param values are not numeric.
     */
    @GET
    @Path("/add/{a}/{b}/{c}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response add(@PathParam("a") String a,
                        @PathParam("b") String b,
                        @PathParam("c") String c) {
        Response response = Response.status(200)
                .entity(calculatorService.add(a, b, c))
                .build();
        return response;
    }

    /**
     * Calculate the subtraction of three numbers.
     *
     * @param a is the first parameter.
     * @param b is the second parameter.
     * @param c is the third parameter.
     * @return subtraction of a, b and c.
     * @throws NumberFormatException if @param values are not numeric.
     */
    @GET
    @Path("/subtract/{a}/{b}/{c}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response subtract(@PathParam("a") String a,
                             @PathParam("b") String b,
                             @PathParam("c") String c) {
        Response response = Response.status(200)
                .entity(calculatorService.subtract(a, b, c))
                .build();
        return response;
    }

    /**
     * Calculate the multiplication of three numbers.
     *
     * @param a is the first parameter.
     * @param b is the second parameter.
     * @param c is the third parameter.
     * @return multiplication of a, b and c.
     * @throws NumberFormatException if @param values are not numeric.
     */
    @GET
    @Path("/multiply/{a}/{b}/{c}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response multiply(@PathParam("a") String a,
                             @PathParam("b") String b,
                             @PathParam("c") String c) {
        Response response = Response.status(200)
                .entity(calculatorService.multiply(a, b, c))
                .build();
        return response;
    }

    /**
     * Calculate division of two numbers.
     *
     * @param a is the first parameter.
     * @param b is the second parameter.
     * @return division of a and b.
     * @throws NumberFormatException if @param values are not numeric.
     */
    @GET
    @Path("/divide/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response divide(@PathParam("a") String a,
                           @PathParam("b") String b) {
        Response response = Response.status(200)
                .entity(calculatorService.divide(a, b))
                .build();
        return response;
    }

}

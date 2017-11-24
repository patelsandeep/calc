package com.calculator.util;

import com.calculator.model.ErrorMessage;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ArithmeticExceptionMapper implements ExceptionMapper<ArithmeticException> {

    @Override
    public Response toResponse(ArithmeticException e) {
        ErrorMessage errorMessage = new ErrorMessage(e.getMessage(), 400);
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(errorMessage)
                .build();
    }

}

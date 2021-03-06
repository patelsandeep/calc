package com.calculator.util;

import com.calculator.model.ErrorMessage;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class OverFlowExceptionMapper implements ExceptionMapper<OverFlowException> {

    @Override
    public Response toResponse(OverFlowException e) {
        ErrorMessage errorMessage = new ErrorMessage(e.getMessage(), 400);
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(errorMessage)
                .build();
    }

}

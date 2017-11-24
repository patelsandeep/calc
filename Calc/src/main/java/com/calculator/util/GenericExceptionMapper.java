package com.calculator.util;

import com.calculator.model.ErrorMessage;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

    @Override
    public Response toResponse(Throwable ex) {
        ErrorMessage errorMessage = new ErrorMessage("URL mismatch", 404);
        return Response.status(Response.Status.NOT_FOUND)
                .entity(errorMessage)
                .build();
    }

}

package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.ModelApiResponse;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;
import java.io.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;


import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-12-07T11:49:24.561Z[GMT]")

public class RemembranzaDirectionsApiServiceImpl extends RemembranzaDirectionsApiService {

	@Override
	public Response remembranzaDirectionsGet(SecurityContext securityContext) throws NotFoundException {
	    String directions = "DN,SA,GD,SA,GI,SA,GC,SA,GD,SA,GI,SA,DST";
		return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, directions)).build();
	}

}

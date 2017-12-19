package com.integration.camel.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.integration.camel.module.to.SimpleServiceOrder;

@Path("/serviceorder")
public interface SimpleServiceOrderService {

	@GET
	@Path("/so/{label}/")
	@Produces("application/json")
	public SimpleServiceOrder getServiceOrderByLabel(@PathParam("label") String label);

	@GET
	@Path("/so/")
	@Produces("application/json")
	public List<SimpleServiceOrder> getServiceOrderList();

	@POST
	@Path("/so/")
	public Response createNewServiceOrder(SimpleServiceOrder serviceOrder);

}

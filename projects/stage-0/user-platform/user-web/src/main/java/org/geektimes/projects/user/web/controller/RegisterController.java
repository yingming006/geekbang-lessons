package org.geektimes.projects.user.web.controller;

import org.geektimes.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import java.io.IOException;
import java.util.Map;

@Path("/register")
public class RegisterController implements PageController {

    @GET
    @Path("/")
    public String register(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        return "register.jsp";
    }

}

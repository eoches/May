package com.adobe.aem.may.batch.core.servlets;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(service = { Servlet.class })
@SlingServletResourceTypes(
        resourceTypes  ="krishna/01"
)

public class Demo1 extends SlingAllMethodsServlet {

    @Override
    protected void doGet( SlingHttpServletRequest req, SlingHttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().write(" Get() Method");
    }

    @Override
    protected void doPost( SlingHttpServletRequest req, SlingHttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().write(" Post() Method");
    }

    @Override
    protected void doPut( SlingHttpServletRequest req, SlingHttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().write("Put() Method");
    }

    @Override
    protected void doDelete( SlingHttpServletRequest req, SlingHttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().write("Delete() Method");
    }
}
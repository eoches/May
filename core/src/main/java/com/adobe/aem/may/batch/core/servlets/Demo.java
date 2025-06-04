package com.adobe.aem.may.batch.core.servlets;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;

@Component(service = Servlet.class)
@SlingServletPaths(value = "/bin/may/sample")
public class Demo extends SlingSafeMethodsServlet {

    @Override
    protected void doGet(final SlingHttpServletRequest req,
                         final SlingHttpServletResponse resp) throws ServletException, IOException {
        String path = req.getParameter("path");
        String message;

        if (path == null || path.isEmpty()) {
            message = "Missing 'path' parameter.";
        } else {

            Resource resource = req.getResourceResolver().getResource(path);
            if (resource != null) {
                ValueMap props = resource.getValueMap();
                String title = props.get("jcr:title", "No Title found at path: " + path);
                message = "Title = " + title;
            } else {
                message = "Resource not found at path: " + path;
            }
        }

        resp.setContentType("text/plain");
        resp.getWriter().write(message);
    }
}

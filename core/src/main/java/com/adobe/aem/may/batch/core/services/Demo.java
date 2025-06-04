
package com.adobe.aem.may.batch.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.ComponentContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, name = "DemoService")
public class Demo {

    private static final Logger LOG = LoggerFactory.getLogger(Demo.class);

    @Activate
    public void activate(ComponentContext context) {
        LOG.info("Service activated: {}", context.getProperties());
    }

    @Deactivate
    public void deactivate(ComponentContext context) {
        LOG.info("Service deactivated");
    }

    @Modified
    public void modified(ComponentContext context) {
        LOG.info("Service configuration modified: {}", context.getProperties());
    }
}

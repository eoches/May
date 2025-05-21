package com.adobe.aem.may.batch.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;



@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DemoModel implements Demo {

    @ValueMapValue
    public String Text;

    @ValueMapValue
    public String Description;

    @ValueMapValue
    public String Number;

    public String getText() {
        return Text;
    }

    public String getDescription() {
        return Description;
    }

    public String getNumber() {
        return Number;
    }


    

}

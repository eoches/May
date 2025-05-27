package com.adobe.aem.may.batch.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;



@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DemoModel implements Demo {

    @ValueMapValue
    private String Title;

    @ValueMapValue
    private String Notes;

    @ValueMapValue
    private int Pageno;

    @ValueMapValue
    private String Date;

    public String getText() {
        return Title;
    }

    public String getDescription() {
        return Notes;
    }

    public int getNumber() {
        return Pageno;
    }

    public String getDate() {
        return Date;
    }


    

}

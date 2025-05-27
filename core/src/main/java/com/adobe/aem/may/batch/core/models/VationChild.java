package com.adobe.aem.may.batch.core.models;
import java.util.Date;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class VationChild {
    @ValueMapValue
    private String bookname;

    @ValueMapValue
    private String bookdes;

    @ValueMapValue
    private int booknum;

    @ValueMapValue
    private Date bookpublishdate;

    @ChildResource
    private List<VationSubChild> bookdetailswithwriter;

    public String getBookname() {
        return bookname;
    }

    public List<VationSubChild> getBookdetailswithwriter() {
        return bookdetailswithwriter;
    }

    public String getBookdes() {
        return bookdes;
    }

    public int getBooknum() {
        return booknum;
    }

    public Date getBookpublishdate() {
        return bookpublishdate;
    }


    
}

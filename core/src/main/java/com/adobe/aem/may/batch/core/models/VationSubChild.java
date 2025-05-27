package com.adobe.aem.may.batch.core.models;
import java.util.Date;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class VationSubChild {


    @ValueMapValue
    private String writername;

    @ValueMapValue
    private String writerinfo;

    @ValueMapValue
    private int writernum;

    @ValueMapValue
    private Date writerdob;

    public String getWritername() {
        return writername;
    }

    public String getWriterinfo() {
        return writerinfo;
    }

    public int getWriternum() {
        return writernum;
    }

    public Date getWriterdob() {
        return writerdob;
    }


}

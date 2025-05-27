package com.adobe.aem.may.batch.core.models;

import	com.day.cq.wcm.api.Page;

import org.apache.sling.api.resource.ResourceResolver;

import java.beans.ConstructorProperties;

import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;



@Model(adaptables = {Resource.class,SlingHttpServletRequest.class},  defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DemoModel{

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

    @ScriptVariable
    Page currentPage;

    public String getArticleTitle()
    {
        return currentPage.getPageTitle();
    }

     public String getArticleTitlePath()
    {
        return currentPage.getPath();
    }

     public Page getArticleTitleParent()
    {
        return currentPage.getParent();
    }


 @Inject
 ResourceResolver resolver;

 public String getNode()
{
    return resolver.getUserID();
}




    

}

package com.adobe.aem.may.batch.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Demo2c implements Demo2 {

    protected static final String RESOURCE_TYPE = "your-project/components/my-multifield";

    @ChildResource(name = "myMultiField")
    private List<Resource> items;

    @Override
    @JsonProperty("items")
    public List<Item> getItems() {
        if (items == null) {
            return Collections.emptyList();
        }
        return items.stream().map(ItemImpl::new).collect(Collectors.toList());
    }

    public static class ItemImpl implements Item {
        private final String title;
        private final String description;
        private final boolean enabled;
        private final long count;

        public ItemImpl(Resource resource) {
            this.title = resource.getValueMap().get("title", "");
            this.description = resource.getValueMap().get("description", "");
            this.enabled = resource.getValueMap().get("enabled", false);
            this.count = resource.getValueMap().get("count", 0L);
        }

        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public String getDescription() {
            return description;
        }

        @Override
        public boolean isEnabled() {
            return enabled;
        }

        @Override
        public long getCount() {
            return count;
        }
    }
}

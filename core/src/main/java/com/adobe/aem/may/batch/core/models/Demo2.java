package com.adobe.aem.may.batch.core.models;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public interface Demo2 {
    @JsonProperty("items")
    List<Item> getItems();

    interface Item {
        String getTitle();
        String getDescription();
        boolean isEnabled();
        long getCount();
    }
}

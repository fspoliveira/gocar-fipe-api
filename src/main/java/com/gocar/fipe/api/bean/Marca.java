package com.gocar.fipe.api.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = false)
public class Marca {

    private String name;

    @JsonProperty("fipe_name")
    private String fipeName;

    private String order;

    private String key;

    private String id;

    /**
     * Gets the attribute name.
     *
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the attribute name.
     *
     * @param name to set the name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the attribute order.
     *
     * @return order.
     */
    public String getOrder() {
        return order;
    }

    /**
     * Sets the attribute order.
     *
     * @param order to set the order.
     */
    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * Gets the attribute key.
     *
     * @return key.
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the attribute key.
     *
     * @param key to set the key.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Gets the attribute id.
     *
     * @return id.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the attribute id.
     *
     * @param id to set the id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the attribute fipeName.
     *
     * @return fipeName.
     */
    public String getFipeName() {
        return fipeName;
    }

    /**
     * Sets the attribute fipeName.
     *
     * @param fipeName to set the fipeName.
     */
    public void setFipeName(String fipeName) {
        this.fipeName = fipeName;
    }

}

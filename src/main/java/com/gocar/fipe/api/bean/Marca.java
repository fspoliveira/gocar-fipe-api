package com.gocar.fipe.api.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Marca {

    private String name;

    private String fipe_name;

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
     * Gets the attribute fipe_name.
     *
     * @return fipe_name.
     */
    public String getFipe_name() {
        return fipe_name;
    }

    /**
     * Sets the attribute fipe_name.
     *
     * @param fipe_name to set the fipe_name.
     */
    public void setFipe_name(String fipe_name) {
        this.fipe_name = fipe_name;
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

}

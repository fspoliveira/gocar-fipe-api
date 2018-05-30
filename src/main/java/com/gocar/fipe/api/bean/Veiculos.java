package com.gocar.fipe.api.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = false)
public class Veiculos {

    @JsonProperty("fipe_marca")
    private String fipeMarca;

    private String name;

    private String marca;

    private String key;

    private String id;

    @JsonProperty("fipe_name")
    private String fipeName;

    /**
     * Gets the attribute fipeMarca.
     *
     * @return fipeMarca.
     */
    public String getFipeMarca() {
        return fipeMarca;
    }

    /**
     * Sets the attribute fipeMarca.
     *
     * @param fipeMarca to set the fipeMarca.
     */
    public void setFipeMarca(String fipeMarca) {
        this.fipeMarca = fipeMarca;
    }

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
     * Gets the attribute marca.
     *
     * @return marca.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Sets the attribute marca.
     *
     * @param marca to set the marca.
     */
    public void setMarca(String marca) {
        this.marca = marca;
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

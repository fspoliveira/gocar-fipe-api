package com.gocar.fipe.api.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = false)
public class Veiculo {

    @JsonProperty("fipe_codigo")
    private String fipeCodigo;

    private String name;

    private String key;

    private String veiculo;

    private String id;

    /**
     * Gets the attribute fipeCodigo.
     *
     * @return fipeCodigo.
     */
    public String getFipeCodigo() {
        return fipeCodigo;
    }

    /**
     * Sets the attribute fipeCodigo.
     *
     * @param fipeCodigo to set the fipeCodigo.
     */
    public void setFipeCodigo(String fipeCodigo) {
        this.fipeCodigo = fipeCodigo;
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
     * Gets the attribute veiculo.
     *
     * @return veiculo.
     */
    public String getVeiculo() {
        return veiculo;
    }

    /**
     * Sets the attribute veiculo.
     *
     * @param veiculo to set the veiculo.
     */
    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
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

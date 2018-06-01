package com.gocar.fipe.api.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = false)
public class VeiculoValor extends Veiculo {

    @JsonProperty("ano_modelo")
    private String anoModelo;

    private String marca;

    private String preco;

    private String combustivel;

    private String referencia;

    /**
     * Gets the attribute anoModelo.
     *
     * @return anoModelo.
     */
    public String getAnoModelo() {
        return anoModelo;
    }

    /**
     * Sets the attribute anoModelo.
     *
     * @param anoModelo to set the anoModelo.
     */
    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
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
     * Gets the attribute preco.
     *
     * @return preco.
     */
    public String getPreco() {
        return preco;
    }

    /**
     * Sets the attribute preco.
     *
     * @param preco to set the preco.
     */
    public void setPreco(String preco) {
        this.preco = preco;
    }

    /**
     * Gets the attribute combustivel.
     *
     * @return combustivel.
     */
    public String getCombustivel() {
        return combustivel;
    }

    /**
     * Sets the attribute combustivel.
     *
     * @param combustivel to set the combustivel.
     */
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    /**
     * Gets the attribute referencia.
     *
     * @return referencia.
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Sets the attribute referencia.
     *
     * @param referencia to set the referencia.
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

}

package com.gocar.fipe.api.constants;

public class RestEndpointsConstants {

    public static final String MARCAS_SERVICE_API = "http://fipeapi.appspot.com/api/1/carros/marcas.json";

    // {0}=Id Marca from http://fipeapi.appspot.com/api/1/carros/marcas.json
    public static final String VEICULOS_SERVICE_API = "http://fipeapi.appspot.com/api/1/carros/veiculos/{0}.json";

    // {0}=Id Marca
    // {1}=Id Veiculo
    public static final String VEICULO_SERVICE_API = "http://fipeapi.appspot.com/api/1/carros/veiculo/{0}/{1}.json";

    // {0}=Id Marca
    // {1}=Id Veiculo
    // {2}=Fipe Codigo
    public static final String VEICULO_VALOR_SERVICE_API = "http://fipeapi.appspot.com/api/1/carros/veiculo/{0}/{1}/{2}.json";
}

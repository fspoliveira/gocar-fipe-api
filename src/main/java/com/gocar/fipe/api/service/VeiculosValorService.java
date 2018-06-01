package com.gocar.fipe.api.service;

import java.text.MessageFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gocar.fipe.api.bean.VeiculoValor;
import com.gocar.fipe.api.constants.RestEndpointsConstants;

@Service
public class VeiculosValorService {

    private static final Logger log = LoggerFactory.getLogger(VeiculosValorService.class);

    public VeiculoValor getVeiculoValorApiFipe(String idMarca,
        String idVeiculo,
        String fipeCodigo) {

        RestTemplate restTemplate = new RestTemplate();
        VeiculoValor veiculoValor = restTemplate.getForObject(MessageFormat.format(RestEndpointsConstants.VEICULO_VALOR_SERVICE_API, idMarca, idVeiculo, fipeCodigo), VeiculoValor.class);

        return veiculoValor;
    }
}
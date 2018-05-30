package com.gocar.fipe.api.service;

import java.text.MessageFormat;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gocar.fipe.api.bean.Veiculo;
import com.gocar.fipe.api.constants.RestEndpointsConstants;

@Service
public class VeiculoService {

    private static final Logger log = LoggerFactory.getLogger(VeiculoService.class);

    public List<Veiculo> getVeiculoApiFipe(String idMarca,
        String idVeiculo) {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<Veiculo>> veiculoResponse =
            restTemplate.exchange(MessageFormat.format(RestEndpointsConstants.VEICULO_SERVICE_API, idMarca, idVeiculo), HttpMethod.GET, null, new ParameterizedTypeReference<List<Veiculo>>() {});
        List<Veiculo> listVeiculo = veiculoResponse.getBody();

        for (Veiculo item : listVeiculo) {
            log.info(item.getName());
        }

        return listVeiculo;
    }
}

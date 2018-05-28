package com.gocar.fipe.api.service;

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
public class VeiculosService {

    private static final Logger log = LoggerFactory.getLogger(VeiculosService.class);

    public List<Veiculo> getVeiculosApiFipe() {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<Veiculo>> veiculosResponse = restTemplate.exchange(RestEndpointsConstants.VEICULLOS_SERVICE_API, HttpMethod.GET, null, new ParameterizedTypeReference<List<Veiculo>>() {});
        List<Veiculo> listVeiculos = veiculosResponse.getBody();

        for (Veiculo item : listVeiculos) {
            log.info(item.getName());
        }

        return listVeiculos;
    }
}

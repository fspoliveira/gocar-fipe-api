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

import com.gocar.fipe.api.bean.Veiculos;
import com.gocar.fipe.api.constants.RestEndpointsConstants;

@Service
public class VeiculosService {

    private static final Logger log = LoggerFactory.getLogger(VeiculosService.class);

    public List<Veiculos> getVeiculosApiFipe(String idMarca) {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<Veiculos>> veiculosResponse =
            restTemplate.exchange(MessageFormat.format(RestEndpointsConstants.VEICULOS_SERVICE_API, idMarca), HttpMethod.GET, null, new ParameterizedTypeReference<List<Veiculos>>() {});
        List<Veiculos> listVeiculos = veiculosResponse.getBody();

        for (Veiculos item : listVeiculos) {
            log.info(item.getName());
        }

        return listVeiculos;
    }
}

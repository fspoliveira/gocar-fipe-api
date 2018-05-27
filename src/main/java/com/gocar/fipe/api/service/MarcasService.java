package com.gocar.fipe.api.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gocar.fipe.api.bean.Marca;
import com.gocar.fipe.api.gocarfipeapi.GocarFipeApiApplication;

@Service
public class MarcasService {

    private static final Logger log = LoggerFactory.getLogger(GocarFipeApiApplication.class);

    public List<Marca> getMarcasApiFipe() {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<Marca>> marcasResponse =
            restTemplate.exchange("http://fipeapi.appspot.com/api/1/carros/marcas.json", HttpMethod.GET, null, new ParameterizedTypeReference<List<Marca>>() {});
        List<Marca> listMarcas = marcasResponse.getBody();

        for (Marca item : listMarcas) {
            log.info(item.getFipe_name());
        }

        return listMarcas;
    }
}

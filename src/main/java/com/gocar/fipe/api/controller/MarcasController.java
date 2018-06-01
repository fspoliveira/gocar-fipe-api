package com.gocar.fipe.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gocar.fipe.api.bean.Marca;
import com.gocar.fipe.api.service.MarcasService;

@RestController
@RequestMapping(value = "/marcas")
public class MarcasController {

    @Autowired
    private MarcasService marcasService;

    // http://localhost:8080/marcas
    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<Marca> marcas() {
        return marcasService.getMarcasApiFipe();
    }
}

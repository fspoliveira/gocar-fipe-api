package com.gocar.fipe.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gocar.fipe.api.bean.Veiculos;
import com.gocar.fipe.api.service.VeiculosService;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculosController {

    @Autowired
    private VeiculosService veiculosService;

    @RequestMapping(method = RequestMethod.GET, params = { "idMarca" })
    public @ResponseBody List<Veiculos> marcas(@RequestParam(name = "idMarca") String idMarca) {
        return veiculosService.getVeiculosApiFipe(idMarca);
    }
}

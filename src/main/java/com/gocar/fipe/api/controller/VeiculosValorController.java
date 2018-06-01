package com.gocar.fipe.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gocar.fipe.api.bean.VeiculoValor;
import com.gocar.fipe.api.service.VeiculosValorService;

@RestController
@RequestMapping(value = "/veiculos/valor")
public class VeiculosValorController {

    @Autowired
    private VeiculosValorService veiculosValorService;

    // http://localhost:8080/veiculos/valor?idMarca=21&idVeiculo=4828&fipeCodigo=2014-1
    @RequestMapping(method = RequestMethod.GET, params = { "idMarca", "idVeiculo", "fipeCodigo" })
    public @ResponseBody VeiculoValor veiculosValor(@RequestParam(name = "idMarca") String idMarca,
        @RequestParam(name = "idVeiculo") String idVeiculo,
        @RequestParam(name = "fipeCodigo") String fipeCodigo) {
        return veiculosValorService.getVeiculoValorApiFipe(idMarca, idVeiculo, fipeCodigo);
    }
}

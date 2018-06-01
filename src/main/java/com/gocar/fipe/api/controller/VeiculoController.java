package com.gocar.fipe.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gocar.fipe.api.bean.Veiculo;
import com.gocar.fipe.api.service.VeiculoService;

@RestController
@RequestMapping(value = "/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    // http://localhost:8080/veiculo?idMarca=21&idVeiculo=4828
    @RequestMapping(method = RequestMethod.GET, params = { "idMarca", "idVeiculo" })
    public @ResponseBody List<Veiculo> veiculo(@RequestParam(name = "idMarca") String idMarca,
        @RequestParam(name = "idVeiculo") String idVeiculo) {
        return veiculoService.getVeiculoApiFipe(idMarca, idVeiculo);
    }
}

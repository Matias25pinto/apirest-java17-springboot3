package com.api.cursoapirest.demo.controllers;

import com.api.cursoapirest.demo.models.Autos;
import com.api.cursoapirest.demo.services.AutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autos/")
public class AutoRestController {
    private AutosService autosService;
    @Autowired
    public AutoRestController(AutosService autosService) {
        this.autosService = autosService;
    }

    @PostMapping(value = "crear", headers = "Accept=application/json")
    public void crearAuto(@RequestBody Autos autos){
        this.autosService.crearAuto(autos);
    }

    @GetMapping(value = "listar", headers = "Accept=application/json")
    public List<Autos> listarAutos(){
        return this.autosService.listarAutos();
    }

    @GetMapping(value = "listarPorId/{id}", headers = "Accept=application/json")
    Optional<Autos> buscarPorId(@PathVariable Long id){
        return autosService.buscarPorId(id);
    }

    @PutMapping(value = "actualizar", headers = "Accept=application/json")
    public void actualizarAuto(@RequestBody Autos autos){
        autosService.actualizarAuto(autos);
    }

    @DeleteMapping(value = "eliminar/{id}", headers = "Accept=application/json")
    public void eliminarAuto(@PathVariable Long id){
        autosService.eliminarAuto(id);
    }

    @GetMapping(value = "listarMarca/{marca}", headers = "Accept=application/json")
    public List<Autos> listarPorMarca(@PathVariable String marca){
        return autosService.buscarPorMarca(marca);
    }
}

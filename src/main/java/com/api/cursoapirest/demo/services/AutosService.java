package com.api.cursoapirest.demo.services;

import com.api.cursoapirest.demo.models.Autos;
import com.api.cursoapirest.demo.repositories.IAutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutosService {
    private IAutosRepository autosRepo;
    @Autowired
    public AutosService(IAutosRepository autosRepo) {
        this.autosRepo = autosRepo;
    }

    public void crearAuto(Autos autos){
        this.autosRepo.save(autos);
    }

    public List<Autos> listarAutos(){
        return this.autosRepo.findAll();
    }

    public void actualizarAuto(Autos autos){
        autosRepo.save(autos);
    }

    public Optional<Autos> buscarPorId(Long id){
        return autosRepo.findById(id);
    }

    public void eliminarAuto(Long id){
        autosRepo.deleteById(id);
    }
    public List<Autos> buscarPorMarca(String marca){
        return autosRepo.findByMarca(marca);
    }
}

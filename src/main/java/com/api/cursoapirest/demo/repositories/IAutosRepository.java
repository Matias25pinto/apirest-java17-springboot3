package com.api.cursoapirest.demo.repositories;

import com.api.cursoapirest.demo.models.Autos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAutosRepository extends JpaRepository<Autos, Long> {
    List<Autos> findByMarca(String marca);
}

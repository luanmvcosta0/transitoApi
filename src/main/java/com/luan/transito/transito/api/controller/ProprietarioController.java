package com.luan.transito.transito.api.controller;

import com.luan.transito.transito.domain.model.Proprietario;
import com.luan.transito.transito.domain.repository.ProprietarioRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;

@AllArgsConstructor
@RestController
public class ProprietarioController {

    private final ProprietarioRepository proprietarioRepository;

    @GetMapping("/proprietarios")
    public List<Proprietario> listar() {
        return proprietarioRepository.findAll();
    }

    @GetMapping("/proprietarios")
        public List<Proprietario> listarEspecifico() {
           return proprietarioRepository.findByNome("Luan Costa");
            //return proprietarioRepository.findAll();
        }

}
package com.salesianostriana.dam.EjemploMappedSuperclass;

import com.salesianostriana.dam.EjemploMappedSuperclass.model.Estudiante;
import com.salesianostriana.dam.EjemploMappedSuperclass.repos.EstudianteRepositorio;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitData {

    private final EstudianteRepositorio estudianteRepositorio;

    @PostConstruct
    public void init(){

        Estudiante e1 = new Estudiante();
        e1.setNombre("PEepe");
        e1.setApellido("GOfañsfdl");
        e1.setCentro("salesianos");
        e1.setCurso("2dam");

        estudianteRepositorio.save(e1);
    }
}

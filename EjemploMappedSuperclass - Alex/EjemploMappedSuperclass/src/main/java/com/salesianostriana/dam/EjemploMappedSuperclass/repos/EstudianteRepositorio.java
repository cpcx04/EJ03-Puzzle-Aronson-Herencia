package com.salesianostriana.dam.EjemploMappedSuperclass.repos;

import com.salesianostriana.dam.EjemploMappedSuperclass.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long> {
}

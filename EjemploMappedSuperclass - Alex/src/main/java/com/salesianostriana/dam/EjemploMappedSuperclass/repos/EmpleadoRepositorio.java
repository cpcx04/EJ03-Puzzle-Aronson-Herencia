package com.salesianostriana.dam.EjemploMappedSuperclass.repos;

import com.salesianostriana.dam.EjemploMappedSuperclass.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long> {
}

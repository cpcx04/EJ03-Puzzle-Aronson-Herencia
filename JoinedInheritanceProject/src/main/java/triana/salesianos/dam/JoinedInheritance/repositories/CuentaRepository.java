package triana.salesianos.dam.JoinedInheritance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import triana.salesianos.dam.JoinedInheritance.models.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
}
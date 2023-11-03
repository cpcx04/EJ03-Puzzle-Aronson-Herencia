package triana.salesianos.dam.JoinedInheritance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import triana.salesianos.dam.JoinedInheritance.models.CuentaDebito;

public interface CuentaDebitoRepository extends JpaRepository<CuentaDebito, Long> {
}
package triana.salesianos.dam.JoinedInheritance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import triana.salesianos.dam.JoinedInheritance.models.CuentaCredito;

public interface CuentaCreditoRepository extends JpaRepository<CuentaCredito, Long> {
}
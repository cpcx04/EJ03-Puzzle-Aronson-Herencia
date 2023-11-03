package triana.salesianos.dam.JoinedInheritance.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cuenta_debito")
public class CuentaDebito extends Cuenta {
    private double cargoOverdraft;
}
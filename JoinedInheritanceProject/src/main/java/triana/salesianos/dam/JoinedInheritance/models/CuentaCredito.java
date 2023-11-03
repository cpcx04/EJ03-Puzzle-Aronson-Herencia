package triana.salesianos.dam.JoinedInheritance.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cuenta_credito")
@NoArgsConstructor
public class CuentaCredito extends Cuenta {

    private double limiteCredito;

    public CuentaCredito(Long id, String dueno, double balance, double tasaInteres, double limiteCredito) {
        super(id, dueno, balance, tasaInteres);
        this.limiteCredito = limiteCredito;
    }
}
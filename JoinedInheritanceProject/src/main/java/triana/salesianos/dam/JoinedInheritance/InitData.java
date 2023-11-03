package triana.salesianos.dam.JoinedInheritance;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import triana.salesianos.dam.JoinedInheritance.models.Cuenta;
import triana.salesianos.dam.JoinedInheritance.models.CuentaCredito;
import triana.salesianos.dam.JoinedInheritance.models.CuentaDebito;
import triana.salesianos.dam.JoinedInheritance.repositories.CuentaCreditoRepository;
import triana.salesianos.dam.JoinedInheritance.repositories.CuentaDebitoRepository;
import triana.salesianos.dam.JoinedInheritance.repositories.CuentaRepository;

@Component
@RequiredArgsConstructor
public class InitData {
    private final CuentaRepository cuentaRepository;
    private final CuentaDebitoRepository cuentaDebitoRepository;
    private final CuentaCreditoRepository cuentaCreditoRepository;

    @PostConstruct
    public void initData() {
        Cuenta c = Cuenta.builder()
                .dueno("Tomás")
                .balance(10)
                .tasaInteres(1)
                .build();

        CuentaCredito cc1 = new CuentaCredito();

        cc1.setLimiteCredito(500);
        cc1.setBalance(1000);
        cc1.setDueno("Pepe");
        cc1.setTasaInteres(1);

        CuentaDebito cd1 = new CuentaDebito();

        cd1.setBalance(300);
        cd1.setDueno("Antonia");
        cd1.setCargoOverdraft(10);
        cd1.setTasaInteres(1);

        cuentaCreditoRepository.save(cc1);
        cuentaDebitoRepository.save(cd1);
    }
}

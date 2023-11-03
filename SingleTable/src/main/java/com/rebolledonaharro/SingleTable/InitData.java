package com.rebolledonaharro.SingleTable;

import com.rebolledonaharro.SingleTable.modals.Ave;
import com.rebolledonaharro.SingleTable.modals.Mamifero;
import com.rebolledonaharro.SingleTable.service.AnimalService;
import com.rebolledonaharro.SingleTable.service.AveService;
import com.rebolledonaharro.SingleTable.service.MamiferoService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitData {

    private final AnimalService animalService;
    private final MamiferoService mamiferoService;
    private final AveService aveService;

    @PostConstruct
    public void test(){

        Mamifero m1 = Mamifero.builder().numDientes(3).numPatas(2)
        .build();
        mamiferoService.save(m1);

        Mamifero m2 = Mamifero.builder().numDientes(4).numPatas(3)
                .build();
        mamiferoService.save(m2);

        Mamifero m3 = Mamifero.builder().numDientes(1).numPatas(10)
                .build();
        mamiferoService.save(m3);

        Mamifero m4 = Mamifero.builder().numDientes(300).numPatas(1)
                .build();
        mamiferoService.save(m4);

        Ave a1 = Ave.builder().numDientes(0).numPatas(2).build();
        Ave a2 = Ave.builder().numDientes(2).numPatas(2).build();
        Ave a3 = Ave.builder().numDientes(6).numPatas(1).build();
        Ave a4 = Ave.builder().numDientes(100).numPatas(2).build();

        aveService.save(a1);
        aveService.save(a2);
        aveService.save(a3);
        aveService.save(a4);


    }

}

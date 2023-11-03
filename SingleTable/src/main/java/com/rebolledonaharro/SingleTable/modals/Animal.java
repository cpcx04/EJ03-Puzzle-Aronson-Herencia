package com.rebolledonaharro.SingleTable.modals;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Animal_type")
@SuperBuilder
@NoArgsConstructor
public abstract class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "num_patas", nullable = false)
    private double numPatas;

    @Column(name = "num_dientes", nullable = false)
    private double numDientes;

}

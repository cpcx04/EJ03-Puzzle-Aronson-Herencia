package com.rebolledonaharro.SingleTable.repo;

import com.rebolledonaharro.SingleTable.modals.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface BaseAnimalRepository<T extends Animal> extends JpaRepository<T, Long> {

}

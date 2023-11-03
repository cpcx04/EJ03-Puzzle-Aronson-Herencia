package com.rebolledonaharro.SingleTable.repo;

import com.rebolledonaharro.SingleTable.modals.Animal;
import com.rebolledonaharro.SingleTable.modals.Ave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AveRepository extends BaseAnimalRepository<Animal> {
}
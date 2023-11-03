package com.rebolledonaharro.SingleTable.service.base;

import com.rebolledonaharro.SingleTable.modals.Animal;
import com.rebolledonaharro.SingleTable.repo.BaseAnimalRepository;

public class BaseAnimalService<T extends Animal, R extends BaseAnimalRepository<T>> extends BaseService<T,Long,R> {


}

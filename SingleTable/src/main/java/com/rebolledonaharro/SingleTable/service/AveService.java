package com.rebolledonaharro.SingleTable.service;

import com.rebolledonaharro.SingleTable.modals.Animal;
import com.rebolledonaharro.SingleTable.repo.AveRepository;
import com.rebolledonaharro.SingleTable.repo.BaseAnimalRepository;
import com.rebolledonaharro.SingleTable.service.base.BaseAnimalService;
import org.springframework.stereotype.Service;

@Service
public class AveService extends BaseAnimalService<Animal, AveRepository> {
}

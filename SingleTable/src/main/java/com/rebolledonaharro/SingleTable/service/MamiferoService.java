package com.rebolledonaharro.SingleTable.service;

import com.rebolledonaharro.SingleTable.modals.Mamifero;
import com.rebolledonaharro.SingleTable.repo.Mamiferorepository;
import com.rebolledonaharro.SingleTable.service.base.BaseAnimalService;
import org.springframework.stereotype.Service;

@Service
public class MamiferoService extends BaseAnimalService<Mamifero, Mamiferorepository> {
}

package com.dabesil.system.services;

import java.util.List;

import com.dabesil.system.domain.Localization;
import com.dabesil.system.dto.LocalizationDTO;
import com.dabesil.system.repository.LocalizationRepository;
import com.dabesil.system.services.exception.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalizationService {

    @Autowired
    private LocalizationRepository repo;

    public List<Localization> findByName(String name) {
        List<Localization> order = repo.findByCidadeLikeIgnoreCase(name);
        if(order ==null){
            throw new ObjectNotFoundException("Objeto Não Encontrado");
        }
        return order; 
    }

    public Localization fromDTO(LocalizationDTO localizationDTO){
        return new Localization(localizationDTO.getId(), localizationDTO.getCidade(), localizationDTO.getLatitude(), localizationDTO.getLongitude());
    }    
}
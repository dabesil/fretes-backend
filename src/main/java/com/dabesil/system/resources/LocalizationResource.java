package com.dabesil.system.resources;

import java.util.List;
import java.util.stream.Collectors;

import com.dabesil.system.domain.Localization;
import com.dabesil.system.dto.LocalizationDTO;
import com.dabesil.system.services.LocalizationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping(value = "/locations")
public class LocalizationResource {

    @Autowired
    private LocalizationService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<LocalizationDTO>> findByName(@PathVariable String id){
        List<Localization> list = service.findByName(id);
        List<LocalizationDTO> listDTO = list.stream().map(obj -> new LocalizationDTO(obj)).collect(Collectors.toList());

        return ResponseEntity.ok().body(listDTO);
    }
    
}

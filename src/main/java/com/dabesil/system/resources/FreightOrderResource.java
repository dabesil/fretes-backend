package com.dabesil.system.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import com.dabesil.system.domain.FreightOrder;
import com.dabesil.system.dto.FreightOrderDTO;
import com.dabesil.system.services.FreightOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(value = "/orders")
public class FreightOrderResource {

    @Autowired
    private FreightOrderService service;
    
    @GetMapping
    public ResponseEntity<List<FreightOrderDTO>>  findAll(){

        List<FreightOrder> list = service.findAll();
        List<FreightOrderDTO> listDTO = list.stream().map(obj -> new FreightOrderDTO(obj)).collect(Collectors.toList());

        return ResponseEntity.ok().body(listDTO);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<FreightOrderDTO>> findByName(@PathVariable String id){
        List<FreightOrder> list = service.findByName(id);
        List<FreightOrderDTO> listDTO = list.stream().map(obj -> new FreightOrderDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody FreightOrderDTO orderDTO){
        FreightOrder order = service.fromDTO(orderDTO);
        order = service.insert(order);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(order.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}

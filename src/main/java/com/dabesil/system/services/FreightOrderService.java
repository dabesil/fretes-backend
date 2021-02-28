package com.dabesil.system.services;

import java.util.List;

import com.dabesil.system.domain.FreightOrder;
import com.dabesil.system.dto.FreightOrderDTO;
import com.dabesil.system.repository.FreightOrderRepository;
import com.dabesil.system.services.exception.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FreightOrderService {

    @Autowired
    private FreightOrderRepository repo;

    public List<FreightOrder> findAll() {
        return repo.findAll();
    }

    public List<FreightOrder> findByName(String name) {
        List<FreightOrder> order = repo.findByRemetenteLikeIgnoreCase(name);
        if(order ==null){
            throw new ObjectNotFoundException("Objeto Não Encontrado");
        }
        return order;           
    }

    public FreightOrder insert(FreightOrder order){
        return repo.insert(order);
    }

    public FreightOrder fromDTO(FreightOrderDTO orderDTO){
        return new FreightOrder(orderDTO.getId(), orderDTO.getRemetente(), orderDTO.getDestinatario(), 
        orderDTO.getTelefoneRem(), orderDTO.getTelefoneDest(), orderDTO.getEndereco(), orderDTO.getDestino(), orderDTO.getOrigem(), orderDTO.getQuantidade(),
        orderDTO.getPeso(), orderDTO.getPreco(), orderDTO.getPaymentStatus(), orderDTO.getStatus());
    }    
}
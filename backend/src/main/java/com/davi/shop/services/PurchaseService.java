package com.davi.shop.services;

import com.davi.shop.dto.PurchaseInsertDTO;
import com.davi.shop.dto.PurchaseShowDTO;
import com.davi.shop.entities.*;
import com.davi.shop.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PurchaseService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private PurchaseRepository purchaseRepository;


    public PurchaseInsertDTO insert(PurchaseInsertDTO dto) {
        customerRepository.save(dto.getCustomer());
        addressRepository.save(dto.getShippingAddress());
        addressRepository.save(dto.getBillingAddress());
        ordersRepository.save(dto.getOrder());
        dto.getOrderItems().stream()
                .map(x -> orderItemRepository.save(x))
                .collect(Collectors.toList());
        return dto;
    }


}

package com.davi.shop.repositories.location;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davi.shop.entities.location.Address;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
public interface AddressRepository extends JpaRepository<Address, Long> {

}

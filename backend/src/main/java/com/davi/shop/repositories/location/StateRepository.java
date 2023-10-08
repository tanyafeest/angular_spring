package com.davi.shop.repositories.location;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.davi.shop.entities.location.State;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
public interface StateRepository extends JpaRepository<State, Long> {
    List<State> findByCountryCode(@Param("code") String countryCode);
}

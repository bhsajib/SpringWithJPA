package com.example.SpringWithJPA.service.jparepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringWithJPA.entity.Coustomer;

public interface Repo extends JpaRepository<Coustomer, Integer> {

}

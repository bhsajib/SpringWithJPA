package com.example.SpringWithJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringWithJPA.entity.Coustomer;
import com.example.SpringWithJPA.service.jparepo.Repo;

@Service
public class MainService implements ServiceInf {
	@Autowired
	Repo repo;

	@Override
	public List<Coustomer> getAll() {
		return repo.findAll();
	}

}

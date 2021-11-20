package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Casa;

public interface ICasaRepository extends JpaRepository<Casa, Integer> {

}

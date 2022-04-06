package com.springbootexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootexample.entity.SanPhamEntity;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPhamEntity, Long>{

}

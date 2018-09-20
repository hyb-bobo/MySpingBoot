package com.shanghai.springboot.mapper;

import com.shanghai.springboot.domain.Tuser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Tuser, Long> {
    public List<Tuser> findAll();
}
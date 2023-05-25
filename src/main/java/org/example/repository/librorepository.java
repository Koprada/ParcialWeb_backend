package org.example.repository;

import org.example.domain.libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface librorepository extends JpaRepository <libro, Long>{

}

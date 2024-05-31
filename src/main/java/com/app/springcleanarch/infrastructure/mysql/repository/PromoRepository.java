package com.app.springcleanarch.infrastructure.mysql.repository;

import com.app.springcleanarch.infrastructure.mysql.persistence.PromoPersistence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromoRepository extends JpaRepository<PromoPersistence, Integer> {
}

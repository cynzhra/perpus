package com.test.api.perpus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.api.perpus.models.Buku;

@Repository
public interface BukuRepository extends JpaRepository<Buku, Long> {
}
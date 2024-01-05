package com.test.api.perpus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.api.perpus.models.Notifikasi;

@Repository
public interface NotifikasiRepository extends JpaRepository<Notifikasi, Long> {

	void persist(Notifikasi notifikasi);
}
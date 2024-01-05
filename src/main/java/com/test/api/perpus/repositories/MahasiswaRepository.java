package com.test.api.perpus.repositories;

import java.util.List;

import com.test.api.perpus.models.Mahasiswa;


public interface MahasiswaRepository{
	int save(Mahasiswa mhsw);
	
	int update(Mahasiswa mhsw);
	
	Mahasiswa findByNim(Long nim);
	
	int deleteByNim(Long nim);
	
	List<Mahasiswa> findAll();

	List<Mahasiswa> findByTitleContaining(String nama);

	int deleteAll();
	
}

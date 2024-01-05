package com.test.api.perpus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.api.perpus.models.Mahasiswa;
import com.test.api.perpus.repositories.MahasiswaRepository;

@Service
public class MahasiswaService {

    @Autowired
    private MahasiswaRepository mahasiswaRepository;

    public int save(Mahasiswa mahasiswa) {
        return mahasiswaRepository.save(mahasiswa);
    }

    public List<Mahasiswa> findAll() {
        return mahasiswaRepository.findAll();
    }

    public Mahasiswa findByNim(Long nim) {
        return mahasiswaRepository.findByNim(nim);
    }

    public int update(Long nim, Mahasiswa mahasiswa) {
        Mahasiswa existingMahasiswa = findByNim(nim);
        if (existingMahasiswa != null) {
            existingMahasiswa.setNim(mahasiswa.getNim());
            existingMahasiswa.setNama(mahasiswa.getNama());
            existingMahasiswa.setJurusan(mahasiswa.getJurusan());
            return save(existingMahasiswa);
        } else {
            return 0;
        }
    }

    public void deleteByNim(Long nim) {
        mahasiswaRepository.deleteByNim(nim);
    }
}
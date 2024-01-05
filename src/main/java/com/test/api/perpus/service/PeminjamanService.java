package com.test.api.perpus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.api.perpus.models.Peminjaman;
import com.test.api.perpus.repositories.PeminjamanRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeminjamanService {

    @Autowired
    private PeminjamanRepository peminjamanRepository;

    public Peminjaman save(Peminjaman peminjaman) {
        return peminjamanRepository.save(peminjaman);
    }

    public List<Peminjaman> findAll() {
        return peminjamanRepository.findAll();
    }

    public Peminjaman findById(Long id) {
        return peminjamanRepository.findById(id).orElse(null);
    }

    public Peminjaman update(Long id, Peminjaman peminjaman) {
        Peminjaman existingPeminjaman = findById(id);
        if (existingPeminjaman != null) {
            existingPeminjaman.setBukuId(peminjaman.getBukuId());
            existingPeminjaman.setPeminjamId(peminjaman.getPeminjamId());
            existingPeminjaman.setTanggalPeminjaman(peminjaman.getTanggalPeminjaman());
            existingPeminjaman.setTanggalPengembalian(peminjaman.getTanggalPengembalian());
            return save(existingPeminjaman);
        } else {
            return null;
        }
    }

    public void deleteById(Long id) {
        peminjamanRepository.deleteById(id);
    }
}
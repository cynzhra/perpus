package com.test.api.perpus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.api.perpus.models.Buku;
import com.test.api.perpus.repositories.BukuRepository;

import java.util.List;

@Service
public class BukuService {

    @Autowired
    private BukuRepository bukuRepository;

    public Buku save(Buku buku) {
        return bukuRepository.save(buku);
    }

    public List<Buku> findAll() {
        return bukuRepository.findAll();
    }

    public Buku findById(Long id) {
        return bukuRepository.findById(id).orElse(null);
    }

    public Buku update(Long id, Buku buku) {
        Buku existingBuku = findById(id);
        if (existingBuku != null) {
            existingBuku.setJudul(buku.getJudul());
            existingBuku.setPenulis(buku.getPenulis());
            existingBuku.setKuantitas(buku.getKuantitas());
            existingBuku.setTempatPenyimpanan(buku.getTempatPenyimpanan());
            return save(existingBuku);
        } else {
            return null;
        }
    }

    public void deleteById(Long id) {
        bukuRepository.deleteById(id);
    }
}
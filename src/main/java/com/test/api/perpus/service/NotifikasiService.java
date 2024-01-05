package com.test.api.perpus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.api.perpus.models.Notifikasi;
import com.test.api.perpus.repositories.NotifikasiRepository;

import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class NotifikasiService {

    @Autowired
    private NotifikasiRepository notifikasiRepository;

    @PersistenceContext
    private NotifikasiRepository entityManager;

    @Transactional
    public Notifikasi createNotifikasi(Notifikasi notifikasiRequest) {
        try {
            Notifikasi notifikasi = new Notifikasi(null, null, null);
            notifikasi.setIsi(notifikasiRequest.getIsi());
            notifikasi.setWaktu(LocalDateTime.now());

            entityManager.persist(notifikasi);
            return notifikasi;
        } catch (Exception e) {
            throw new RuntimeException("Failed to create notification: " + e.getMessage(), e);
        }
    }
    
    public Notifikasi save(Notifikasi notifikasi) {
        return notifikasiRepository.save(notifikasi);
    }

    public List<Notifikasi> findAll() {
        return notifikasiRepository.findAll();
    }

    public Notifikasi findById(Long id) {
        return notifikasiRepository.findById(id).orElse(null);
    }

    public Notifikasi update(Long id, Notifikasi notifikasi) {
        Notifikasi existingNotifikasi = findById(id);
        if (existingNotifikasi != null) {
            existingNotifikasi.setIsi(notifikasi.getIsi());
            existingNotifikasi.setWaktu(LocalDateTime.now());
            return save(existingNotifikasi);
        } else {
            return null;
        }
    }

    public void deleteById(Long id) {
        notifikasiRepository.deleteById(id);
    }
}
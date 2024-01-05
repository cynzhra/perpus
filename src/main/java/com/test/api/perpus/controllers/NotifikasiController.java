package com.test.api.perpus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.test.api.perpus.models.Notifikasi;
import com.test.api.perpus.service.NotifikasiService;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/notifikasi")
public class NotifikasiController {

    @Autowired
    private NotifikasiService notifikasiService;

    @PostMapping
    public Notifikasi create(@RequestBody Notifikasi notifikasi) {
        notifikasi.setWaktu(LocalDateTime.now());
        return notifikasiService.save(notifikasi);
    }

    @GetMapping
    public List<Notifikasi> findAll() {
        return notifikasiService.findAll();
    }

    @GetMapping("/{id}")
    public Notifikasi findById(@PathVariable Long id) {
        return notifikasiService.findById(id);
    }

    @PutMapping("/{id}")
    public Notifikasi update(@PathVariable Long id, @RequestBody Notifikasi notifikasi) {
        return notifikasiService.update(id, notifikasi);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        notifikasiService.deleteById(id);
    }
}
package com.test.api.perpus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.test.api.perpus.models.Buku;
import com.test.api.perpus.service.BukuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buku")
public class BukuController {

    @Autowired
    private BukuService bukuService;

    @PostMapping
    public Buku create(@RequestBody Buku buku) {
        return bukuService.save(buku);
    }

    @GetMapping
    public List<Buku> findAll() {
        return bukuService.findAll();
    }

    @GetMapping("/{id}")
    public Buku findById(@PathVariable Long id) {
        return bukuService.findById(id);
    }

    @PutMapping("/{id}")
    public Buku update(@PathVariable Long id, @RequestBody Buku buku) {
        return bukuService.update(id, buku);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bukuService.deleteById(id);
    }
}
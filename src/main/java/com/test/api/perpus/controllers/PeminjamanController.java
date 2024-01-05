package com.test.api.perpus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.test.api.perpus.models.Peminjaman;
import com.test.api.perpus.service.PeminjamanService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/peminjaman")
public class PeminjamanController {

    @Autowired
    private PeminjamanService peminjamanService;

    @PostMapping
    public Peminjaman create(@RequestBody Peminjaman peminjaman) {
        return peminjamanService.save(peminjaman);
    }

    @GetMapping
    public List<Peminjaman> findAll() {
        return peminjamanService.findAll();
    }

    @GetMapping("/{id}")
    public Peminjaman findById(@PathVariable Long id) {
        return peminjamanService.findById(id);
    }

    @PutMapping("/{id}")
    public Peminjaman update(@PathVariable Long id, @RequestBody Peminjaman peminjaman) {
        return peminjamanService.update(id, peminjaman);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        peminjamanService.deleteById(id);
    }
}

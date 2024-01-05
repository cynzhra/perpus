package com.test.api.perpus.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.test.api.perpus.models.Mahasiswa;
import com.test.api.perpus.service.MahasiswaService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/mahasiswa")
public class MahasiswaController {
	
	@Autowired
	private MahasiswaService mahasiswaService;
	
	@PostMapping
    public int create(@RequestBody Mahasiswa mahasiswa) {
        return mahasiswaService.save(mahasiswa);
    }

    @GetMapping
    public List<Mahasiswa> findAll() {
        return mahasiswaService.findAll();
    }

    @GetMapping("/{nim}")
    public Mahasiswa findById(@PathVariable Long nim) {
        return mahasiswaService.findByNim(nim);
    }

    @PutMapping("/{nim}")
    public int update(@PathVariable Long nim, @RequestBody Mahasiswa mahasiswa) {
        return mahasiswaService.update(nim, mahasiswa);
    }

    @DeleteMapping("/{nim}")
    public void delete(@PathVariable Long nim) {
        mahasiswaService.deleteByNim(nim);
    }

}

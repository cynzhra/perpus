package com.test.api.perpus.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Notifikasi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isi;
    private LocalDateTime waktu;

	public Notifikasi(Long id, String isi, LocalDateTime waktu) {
		this.id = id;
		this.isi = isi;
		this.waktu = waktu;
	}
	
	public Notifikasi(String isi, LocalDateTime waktu) {
		this.isi = isi;
		this.waktu = waktu;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setIsi(String isi) {
		this.isi = isi;
	}
	
	public String getIsi() {
		return isi;
	}
	
	public void setWaktu(LocalDateTime waktu) {
		this.waktu = waktu;
	}
	
	public LocalDateTime getWaktu() {
		return waktu;
	}
	
	@Override
	  public String toString() {
	    return "Notifikasi [id=" + id + ", isi=" + isi + ", waktu=" + waktu+ "]";
	  }
}
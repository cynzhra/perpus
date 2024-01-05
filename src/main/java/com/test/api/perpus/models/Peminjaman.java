package com.test.api.perpus.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Peminjaman {
	private Long id;
	private Long buku_id;
	private Long nim;
	private LocalDate tanggal_peminjaman;
	private LocalDate batas_pengembalian;
	private LocalDate tanggal_pengembalian;
	
	public Peminjaman(Long id, Long buku_id, Long nim, LocalDate tanggal_peminjaman, LocalDate batas_pengembalian, LocalDate tanggal_pengembalian) {
		this.id = id;
		this.buku_id = buku_id;
		this.nim = nim;
		this.tanggal_peminjaman = tanggal_peminjaman;
		this.batas_pengembalian = batas_pengembalian;
		this.tanggal_pengembalian = tanggal_pengembalian;
	}
	
	public Peminjaman(Long buku_id, Long nim, LocalDate tanggal_peminjaman, LocalDate batas_pengembalian, LocalDate tanggal_pengembalian) {
		this.buku_id = buku_id;
		this.nim = nim;
		this.tanggal_peminjaman = tanggal_peminjaman;
		this.batas_pengembalian = batas_pengembalian;
		this.tanggal_pengembalian = tanggal_pengembalian;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setBukuId(Long id) {
		this.buku_id = id;
	}
	
	public Long getBukuId() {
		return buku_id;
	}
	
	public void setPeminjamId(Long nim) {
		this.nim = nim;
	}
	
	public Long getPeminjamId() {
		return nim;
	}
	
	public void setTanggalPeminjaman(LocalDate tgl) {
		this.tanggal_peminjaman = tgl;
	}
	
	public LocalDate getTanggalPeminjaman() {
		return tanggal_peminjaman;
	}
	
	public void setBatasPengembalian(LocalDate tgl) {
		this.batas_pengembalian = tgl;
	}
	
	public LocalDate getBatasPengembalian() {
		return batas_pengembalian;
	}
	
	public void setTanggalPengembalian(LocalDate tgl) {
		this.tanggal_pengembalian = tgl;
	}
	
	public LocalDate getTanggalPengembalian() {
		return tanggal_pengembalian;
	}
	
	@Override
	  public String toString() {
	    return "Peminjaman [id=" + id + ", buku_id=" + buku_id + ", nim=" + nim+ "tanggal_peminjaman=" + tanggal_peminjaman + ", batas_pengembalian=" + batas_pengembalian + ", tanggal_pengembalian=" + tanggal_pengembalian+ "]";
	  }
}

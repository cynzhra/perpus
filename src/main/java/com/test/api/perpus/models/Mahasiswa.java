package com.test.api.perpus.models;

public class Mahasiswa {

	private long nim;
	private String nama;
	private String jurusan;
	
	public Mahasiswa(long nim, String nama, String Jurusan) {
		this.nim = nim;
		this.nama = nama;
		this.jurusan = jurusan;
	}
	
	public Mahasiswa(String nama, String jurusan) {
		this.nama = nama;
		this.jurusan = jurusan;
	}
	
	public void setNim(long nim) {
		this.nim = nim;
	}
	
	public long getNim() {
		return nim;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}
	
	public String getJurusan() {
		return jurusan;
	}
	
	@Override
	  public String toString() {
	    return "Mahasiswa [nim=" + nim + ", nama=" + nama + ", jurusan=" + jurusan+ "]";
	  }

}

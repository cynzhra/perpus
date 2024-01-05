package com.test.api.perpus.models;

public class Buku {
	private Long id;
	private String judul;
	private String penulis;
	private Integer kuantitas;
	private String tempat_penyimpanan;
	
	public Buku(Long id, String judul, String penulis, Integer kuantitas, String tempat_penyimpanan) {
		this.id = id;
		this.judul = judul;
		this.penulis = penulis;
		this.kuantitas = kuantitas;
		this.tempat_penyimpanan = tempat_penyimpanan;
	}
	
	public Buku(String judul, String penulis, Integer kuantitas, String tempat_penyimpanan) {
		this.judul = judul;
		this.penulis = penulis;
		this.kuantitas = kuantitas;
		this.tempat_penyimpanan = tempat_penyimpanan;
	}
	
	public void setBukuId(long id) {
		this.id = id;
	}
	
	public Long getBukuId() {
		return id;
	}
	
	public void setJudul(String judul) {
		this.judul = judul;
	}
	
	public String getJudul() {
		return judul;
	}
	
	public void setPenulis(String penulis) {
		this.penulis = penulis;
	}
	
	public String getPenulis() {
		return penulis;
	}
	

	public void setKuantitas(Integer kuantitas) {
		this.kuantitas = kuantitas;
	}
	
	public Integer getKuantitas() {
		return kuantitas;
	}
	
	public void setTempatPenyimpanan(String tempat) {
		this.tempat_penyimpanan = tempat;
	}
	
	public String getTempatPenyimpanan() {
		return tempat_penyimpanan;
	}
	
	@Override
	  public String toString() {
	    return "Buku [id=" + id + ", judul=" + judul + ", penulis=" + penulis+ ", kuantitas=" + kuantitas + ", tempat_penyimpanan=" + tempat_penyimpanan + "]";
	  }
}

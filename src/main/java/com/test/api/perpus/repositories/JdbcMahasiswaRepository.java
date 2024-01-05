package com.test.api.perpus.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.test.api.perpus.models.Mahasiswa;

@Repository
public class JdbcMahasiswaRepository implements MahasiswaRepository{
	
	  @Autowired
	  private JdbcTemplate jdbcTemplate;

	@Override
	public int save(Mahasiswa mhsw) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("Inset into mahasiswa(nim, nama, jurusan) values (?, ?, ?)",
				new Object[] {
						mhsw.getNim(),mhsw.getNama(), mhsw.getJurusan()
				});
	}

	@Override
	public int update(Mahasiswa mhsw) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("Update mahasiswa set nama=?, jurusan=? where id=?",
				new Object[] {
						mhsw.getNim(),mhsw.getNama(), mhsw.getJurusan()						
				});
	}

	@Override
	public Mahasiswa findByNim(Long nim) {
		// TODO Auto-generated method stub
		try {
		      Mahasiswa mhsw = jdbcTemplate.queryForObject("SELECT * FROM mahasiswa WHERE nim=?",
		          BeanPropertyRowMapper.newInstance(Mahasiswa.class), nim);

		      return mhsw;
		    } catch (IncorrectResultSizeDataAccessException e) {
		      return null;
		    }
	}

	@Override
	public int deleteByNim(Long nim) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("DELETE FROM mahasiswa WHERE nim=?", nim);
	}

	@Override
	public List<Mahasiswa> findAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * from mahasiswa", BeanPropertyRowMapper.newInstance(Mahasiswa.class));
	}


	@Override
	public List<Mahasiswa> findByTitleContaining(String nama) {
		// TODO Auto-generated method stub
		 String q = "SELECT * from mahasiswa WHERE nama ILIKE '%" + nama + "%'";

		    return jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(Mahasiswa.class));
	}

	@Override
	public int deleteAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("delete from mahasiswa");
	}

	  

}

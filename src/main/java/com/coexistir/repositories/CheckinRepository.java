package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Checkin;

public interface AdminRepository extends JpaRepository<Checkin, Integer> {
	
	public Checkin findByIdCheckinLike(Integer idCheckin);

}

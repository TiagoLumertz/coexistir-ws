package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Checkin;

public interface CheckinRepository extends JpaRepository<Checkin, Integer> {
	
	Checkin findByIdCheckinLike(Integer idCheckin);

}

package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Checkin;

<<<<<<< HEAD
public interface CheckinRepository extends JpaRepository<Checkin, Integer> {
=======
public interface AdminRepository extends JpaRepository<Checkin, Integer> {
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc
	
	public Checkin findByIdCheckinLike(Integer idCheckin);

}

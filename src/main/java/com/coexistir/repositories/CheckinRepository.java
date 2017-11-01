package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Checkin;

<<<<<<< HEAD
public interface CheckinRepository extends JpaRepository<Checkin, Integer> {
=======
<<<<<<< HEAD
public interface CheckinRepository extends JpaRepository<Checkin, Integer> {
=======
public interface AdminRepository extends JpaRepository<Checkin, Integer> {
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc
>>>>>>> 0a353a5a931b58927cd872355b7936317f35ca0d
	
	Checkin findByIdCheckinLike(Integer idCheckin);

}

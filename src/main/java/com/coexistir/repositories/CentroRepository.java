package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Centro;

<<<<<<< HEAD
public interface CentroRepository extends JpaRepository<Centro, Integer> {
=======
<<<<<<< HEAD
public interface CentroRepository extends JpaRepository<Centro, Integer> {
=======
public interface AdminRepository extends JpaRepository<Centro, Integer> {
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc
>>>>>>> 0a353a5a931b58927cd872355b7936317f35ca0d
	
	Centro findByIdCentroLike(Integer idCentro);

}

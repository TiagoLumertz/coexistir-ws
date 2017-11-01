package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.ElevarAdmin;

<<<<<<< HEAD
public interface ElevarAdminRepository extends JpaRepository<ElevarAdmin, Integer> {
	
	public ElevarAdmin findByIdElevarAdminLike(Integer idElevarAdmin);

=======
public interface AdminRepository extends JpaRepository<ElevarAdmin, Integer> {
	
	public ElevarAdmin findByIdElevarAdminLike(Integer idElevarAdmin);
]
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc
}

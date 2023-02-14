package com.xworkz.eggD9.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.eggD9.dto.EggDTO;
@Repository
public class EggRepositoryImpl implements EggRepository {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public EggRepositoryImpl() {
		System.out.println("Constructor is Created in : " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(EggDTO dto) {
		//MAKE SURE AUTOWIRE entityManagerFactory.
		System.out.println("Running Save in Egg RepoImpl");
		EntityManager entityManager  =
				this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(dto);
		transaction.commit();
		entityManager.close();
		return false;
	}

}

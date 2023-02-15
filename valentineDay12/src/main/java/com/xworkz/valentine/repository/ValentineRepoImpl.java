package com.xworkz.valentine.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.valentine.entity.ValentineEntity;

@Repository
public class ValentineRepoImpl implements ValentineRepo {

	@Autowired
	private EntityManagerFactory entity;

	@Override
	public boolean save(ValentineEntity entity) {
		System.out.println("Inside the save method in ValentineRepoImpl ");
		EntityManager em = this.entity.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return true;
	}

}

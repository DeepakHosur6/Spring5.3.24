package com.xworkz.springDay9LambookQuarkus.boot;

import com.xworkz.springDay9LambookQuarkus.dto.SoldierDTO;
import com.xworkz.springDay9LambookQuarkus.repo.SoldierRepo;
import com.xworkz.springDay9LambookQuarkus.repo.SoldierRepoImpl;
import com.xworkz.springDay9LambookQuarkus.service.SoldierServiceImpl;

public class SoldierTest {
	
	
		public static void main(String[] args) {
			SoldierDTO soldierDTO = new SoldierDTO();
			soldierDTO.setId(15);
			soldierDTO.setName("akash");
			soldierDTO.setRank("topper");
			//soldierDTO.setBetallion("American");
			//soldierDTO.setCountry("India");
			System.out.println(soldierDTO);

			SoldierServiceImpl service = new SoldierServiceImpl();
			SoldierRepo repo = new SoldierRepoImpl();
			service.setSoldierRepo(repo);
			service.validateAndSave(soldierDTO);
	}

}

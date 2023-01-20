package com.xwork.spring_template.soldier.repo;

import org.springframework.stereotype.Component;

import com.xwork.spring_template.soldier.dto.ResortDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class ResortRepoImpl implements ResortRepo {

	@Override
	public boolean save(ResortDTO rstdto) {
		System.out.println("running save in repo ");
		System.out.println("rstDTO : " + rstdto);
		return true;
	}

}

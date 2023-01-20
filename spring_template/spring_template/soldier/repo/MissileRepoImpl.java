package com.xwork.spring_template.soldier.repo;

import org.springframework.stereotype.Component;

import com.xwork.spring_template.soldier.dto.MissileDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class MissileRepoImpl implements MissileRepo {

	@Override
	public boolean saves(MissileDTO msldto) {
		System.out.println("running save in repo ");
		System.out.println("mslDTO : " + msldto);
		return true;
	}

}

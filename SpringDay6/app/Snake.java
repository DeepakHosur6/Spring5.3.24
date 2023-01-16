package com.xworkz.SpringDay6.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Snake {

	private String snakeName;
	@Value("13.6")
	private Double snakeLength;
	private String type;
	@Value("Sliver")
	private String snakeColor;
	private Boolean poision;

	@Autowired
	public Snake(@Qualifier("sName") String snakeName, @Qualifier("type")String type,@Qualifier("poision") Boolean poision) {
		super();
		this.snakeName = snakeName;

		this.type = type;
		this.poision=poision;

	}

	@Override
	public String toString() {
		return "Snake [snakeName=" + snakeName + ", snakeLength=" + snakeLength + ", type=" + type + ", snakeColor="
				+ snakeColor + ", poision=" + poision + "]";
	}

}

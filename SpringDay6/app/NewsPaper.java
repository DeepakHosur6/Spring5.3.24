package com.xworkz.SpringDay6.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {

	@Value("20")
	private int id;

	private String name;
	private String ownerName;
	@Value("English")
	private String language;
	private Double price;

	@Autowired
	public NewsPaper(@Qualifier("paperName") String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	@Qualifier("211")
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language + ", price="
				+ price + "]";
	}

}
